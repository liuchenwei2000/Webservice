/**
 * 
 */
package server2;

import javax.xml.ws.Endpoint;

/**
 * ������
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��5��21��
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/add", new WebServiceImpl());
	}

}
