/**
 * 
 */
package client;

import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2013-8-28
 */
public class XMLReader {

	public static List<ClientPerson> read(String xml) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		PersonSaxParseHandler handler = new PersonSaxParseHandler();
		parser.parse(xml, handler);
		return handler.getPersons();
	}
	
	public static List<ClientPerson> read(InputStream is) throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		PersonSaxParseHandler handler = new PersonSaxParseHandler();
		parser.parse(is, handler);
		return handler.getPersons();
	}
}
