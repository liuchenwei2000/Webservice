/**
 * 
 */
package server1;

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
		// ʹ��ָ����ַ����һ��webservice����̬����webservice����ĸ����ļ�
		Endpoint.publish("http://localhost:8888/helloworld", new WebServiceImpl());
	}
}
