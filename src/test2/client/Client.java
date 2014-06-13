/**
 * 
 */
package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * 
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2013-8-26
 */
public class Client {

	public static String WS_URL = "http://127.0.0.1:8001/ncServicePort";
    
    // ����������   
    public static void main(String[] args) throws IOException, Exception {   
        testService("liucw1");   
    }   
	
    // ����WS   
    private static void testService(String name) throws Exception,   
            IOException {   
        // ����������   
//        StringBuffer sendMsgBuffer = new StringBuffer(   
//                "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sd=\"http://www.sd.yonyou.com\">");   
//        sendMsgBuffer.append("<soapenv:Header/>").append("<soapenv:Body>")   
//                .append("<sd:find>").append("<arg0>").append(name)   
//                .append("</arg0>").append(" </sd:find>")   
//                .append("</soapenv:Body>").append("</soapenv:Envelope>");   
    	 StringBuffer sendMsgBuffer = new StringBuffer(   
         "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:sd=\"http://www.sd.yonyou.com\">");   
 sendMsgBuffer.append("<soapenv:Header/>").append("<soapenv:Body>")   
         .append("      <sd:findAll/>")   
         .append("</soapenv:Body>").append("</soapenv:Envelope>");  
        String sendMsg = sendMsgBuffer.toString();   
  
        // ����HTTP����
        URL url = new URL(WS_URL);   
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();   
           
        // ����HTTP���������Ϣ   
        httpConn.setRequestProperty("Content-Length",   
                String.valueOf(sendMsg.getBytes().length));   
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");   
        httpConn.setRequestMethod("POST");   
        httpConn.setDoOutput(true);   
        httpConn.setDoInput(true);   
  
        // ����HTTP����   
        OutputStream outObject = httpConn.getOutputStream();   
        outObject.write(sendMsg.getBytes());   
           
        // �ر������   
        outObject.close();   
  
        // ��ȡHTTP��Ӧ����   
        InputStream inputStream = httpConn.getInputStream();
     List<ClientPerson> list = XMLReader.read(inputStream);
        System.out.println(list.size());
//		InputStreamReader isr = new InputStreamReader(   
//                inputStream, "utf-8");   
//        BufferedReader inReader = new BufferedReader(isr);   
//        StringBuffer result = new StringBuffer();   
//        String inputLine;   
//        while ((inputLine = inReader.readLine()) != null) {   
//            result.append(inputLine);   
//        }   
//           
//        // ��ӡHTTP��Ӧ����   
//        System.out.println(result);   
//        // �ر�������   
//        inReader.close();   
//        isr.close();   
    }   
}
