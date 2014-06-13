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
 * @author 刘晨伟
 * 
 * 创建日期：2013-8-26
 */
public class Client {

	public static String WS_URL = "http://127.0.0.1:8001/ncServicePort";
    
    // 测试主方法   
    public static void main(String[] args) throws IOException, Exception {   
        testService("liucw1");   
    }   
	
    // 调用WS   
    private static void testService(String name) throws Exception,   
            IOException {   
        // 构建请求报文   
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
  
        // 开启HTTP连接
        URL url = new URL(WS_URL);   
        HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();   
           
        // 设置HTTP请求相关信息   
        httpConn.setRequestProperty("Content-Length",   
                String.valueOf(sendMsg.getBytes().length));   
        httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");   
        httpConn.setRequestMethod("POST");   
        httpConn.setDoOutput(true);   
        httpConn.setDoInput(true);   
  
        // 进行HTTP请求   
        OutputStream outObject = httpConn.getOutputStream();   
        outObject.write(sendMsg.getBytes());   
           
        // 关闭输出流   
        outObject.close();   
  
        // 获取HTTP响应数据   
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
//        // 打印HTTP响应数据   
//        System.out.println(result);   
//        // 关闭输入流   
//        inReader.close();   
//        isr.close();   
    }   
}
