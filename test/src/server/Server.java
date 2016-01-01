/**
 * 
 */
package server;

import javax.xml.ws.Endpoint;

/**
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2013-8-26
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:8001/ncServicePort", new NCService());   
	}

}
