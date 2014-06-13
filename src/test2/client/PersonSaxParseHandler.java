package client;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2013-8-28
 */
public class PersonSaxParseHandler extends DefaultHandler {
	
    private List<ClientPerson> persons = null;   
    private ClientPerson person = null;  
    
    private String preTag = null;//�����Ǽ�¼����ʱ����һ���ڵ�����   

    public List<ClientPerson> getPersons(){   
        return persons;   
    }   
       
    @Override  
    public void startDocument() throws SAXException {   
    	persons = new ArrayList<ClientPerson>();   
    }   
  
    @Override  
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {   
        if("return".equals(qName)){   
            person = new ClientPerson();   
        }   
        preTag = qName;//�����ڽ����Ľڵ����Ƹ���preTag   
    }   
  
    @Override  
    public void endElement(String uri, String localName, String qName)   
            throws SAXException {   
        if("return".equals(qName)){   
        	persons.add(person);   
            person = null;   
        }   
        preTag = null;
    }   
       
    @Override  
    public void characters(char[] ch, int start, int length) throws SAXException {   
        if(preTag!=null){   
            String content = new String(ch,start,length);   
            if("name".equals(preTag)){   
                person.setPname(content);
            }else if("id".equals(preTag)){   
                person.setPk(content);   
            } else if("birthday".equals(preTag)){   
            	person.setPbirthday(content);
            }   
        }   
    }   
       
}  
