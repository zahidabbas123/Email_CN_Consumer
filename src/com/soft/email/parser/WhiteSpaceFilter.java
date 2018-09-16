package com.soft.email.parser;

import java.util.Stack;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.XMLReader;
import org.xml.sax.SAXException;
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

public class WhiteSpaceFilter
   extends XMLFilterImpl{

   protected Stack stack;

   public WhiteSpaceFilter() {
      super();
   }

   public WhiteSpaceFilter(XMLReader reader)   {
      super(reader);
   }

   public void startElement(String uri,
                            String name,
                            String qualifiedName,
                            Attributes atts)
      throws SAXException  {
      String space = atts.getValue("xml:space");
      if(null != space && space.equals("preserve"))
         stack.push(null);
      else
         stack.push(new StringBuffer());
      super.startElement(uri,name,qualifiedName,atts);
   }

   public void endElement(String uri,
                          String name,
                          String qualifiedName)
      throws SAXException   {
      Object object = stack.pop();
      if(object instanceof StringBuffer)
      {
         StringBuffer input = (StringBuffer)object,
                      output = new StringBuffer();
         boolean wasWhitespace = false;
         for(int current = 0;current < input.length();current++)
         {
            char c = input.charAt(current);
            if(c == '\n' || c == '\r')
               c = ' ';
            if(Character.isWhitespace(c))
            {
               if(!wasWhitespace)
                  output.append(c);
               wasWhitespace = true;
            }
            else
            {
               output.append(c);
               wasWhitespace = false;
            }
         }
         char[] chars = new char[output.length()];
         output.getChars(0,output.length(),chars,0);
         super.characters(chars,0,output.length());
      }
      super.endElement(uri,name,qualifiedName);
   }

   public void characters(char[] chars,int start,int length)      throws SAXException   {
      Object object = stack.peek();
      if(object instanceof StringBuffer)
         ((StringBuffer)object).append(chars,start,length);
      else
         super.characters(chars,start,length);
   }

   public void startDocument()      throws SAXException   {
      stack = new Stack();
      super.startDocument();
   }
}
