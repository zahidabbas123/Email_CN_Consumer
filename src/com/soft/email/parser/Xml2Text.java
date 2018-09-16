package com.soft.email.parser;

import org.xml.sax.helpers.DefaultHandler;
import java.io.PrintWriter;
import org.xml.sax.Attributes;
/**
 * <p>Title: Terminus Billing System</p>
 *
 * <p>Copyright: Copyright (c) 2006</p>
 *
 * <p>Company: Comcerto (pvt) Ltd.</p>
 *
 * @author Afzaal
 *
 * @version 1.0
 **/

public class Xml2Text
   extends DefaultHandler
{
   protected static final String
      NAMESPACE_URI = "http://www.comcerto.net";
   protected static final int NONE = 0,
                              ROOT = 1,
                              BLOCK = 2;
   protected StringBuffer buffer;
   protected int state,
                 lineWidth,
                 linesAfter;
   protected PrintWriter writer = null;

   public Xml2Text(PrintWriter writer)   {
      this.writer = writer;
   }

   public void startElement(String uri,
                            String name,
                            String qualifiedName,
                            Attributes atts){
      if(!uri.equals(NAMESPACE_URI))
         return;
      if(state == ROOT && name.equals("block")){
         state = BLOCK;
         buffer = new StringBuffer(1280);
         try{
            linesAfter =
               Integer.parseInt(atts.getValue("linesAfter"));
         }
         catch(NumberFormatException e){
            linesAfter = 0;
         }
      }
      else if(state == NONE && name.equals("root"))  {
         state = ROOT;
         try {
            lineWidth =
               Integer.parseInt(atts.getValue("lineWidth"));
         }
         catch(NumberFormatException e) {
            lineWidth = 65;
         }
      }
   }

   public void endElement(String uri,
                          String name,
                          String qualifiedName)   {
      if(!uri.equals(NAMESPACE_URI))
         return;
      if(state == BLOCK && name.equals("block")) {
         state = ROOT;
         int start = 0,
             current = start,
             lastSpace = start - 1;
         while(current < buffer.length()){
            while(current < start + lineWidth &&
                  current < buffer.length()){
               if(Character.isWhitespace(buffer.charAt(current)))
                  lastSpace = current;
               current++;
            }
            if(current < buffer.length() && start < lastSpace)  {
               for(int i = start;i < lastSpace;i++)
                  writer.print(buffer.charAt(i));
               start = lastSpace + 1;
            }
            else{
               for(int i = start;i < current;i++)
                  writer.print(buffer.charAt(i));
               start = current;
            }
            current = start;
            lastSpace = start - 1;
            writer.println();
         }
         for(int i = 0;i < linesAfter;i++)
            writer.println();
         buffer.delete(0,buffer.length());
      }
      else if(state == ROOT && name.equals("root"))
         state = NONE;
   }

   public void characters(char[] chars,int start,int length)   {
      if(state == BLOCK)
         buffer.append(chars,start,length);
   }

   public void startDocument()   {
      state = NONE;
   }

   public void endDocument()   {
      writer.flush();
   }
}
