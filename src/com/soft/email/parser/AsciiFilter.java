package com.soft.email.parser;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLFilterImpl;
import org.xml.sax.SAXException;
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
public class AsciiFilter
   extends XMLFilterImpl{
   public AsciiFilter()   {
      super();
   }

   public AsciiFilter(XMLReader reader)   {
      super(reader);
   }

   public void characters(char[] chars,int start,int length)      throws SAXException   {
      StringBuffer filtered =
         new StringBuffer((int)(length * 1.1));
      int i = start,
          stop = start + length;
      while(i < stop)      {
         char c = chars[i++];
         switch(c)  {
            case 'œ':
               filtered.append("oe");
               break;
            case '©':
               filtered.append("(c)");
               break;
            case 'à':
            case 'á':
            case 'â':
            case 'ã':
            case 'ä':
            case 'å':
               filtered.append('a');
               break;
            case 'æ':
               filtered.append("ae");
               break;
            case 'ç':
               filtered.append('c');
               break;
            case 'è':
            case 'é':
            case 'ê':
            case 'ë':
               filtered.append('e');
               break;
            case 'ì':
            case 'í':
            case 'î':
            case 'ï':
               filtered.append('i');
               break;
            case 'ò':
            case 'ó':
            case 'ô':
            case 'õ':
            case 'ö':
               filtered.append('o');
               break;
            case 'ù':
            case 'ú':
            case 'û':
            case 'ü':
               filtered.append('u');
               break;
            // more characters would come here
            default:
               filtered.append(c);
         }
      }
      char[] newChars = new char[filtered.length()];
      filtered.getChars(0,filtered.length(),newChars,0);
      super.characters(newChars,0,filtered.length());
   }
}
