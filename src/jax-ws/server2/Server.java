/**
 * 
 */
package server2;

import javax.xml.ws.Endpoint;

/**
 * 服务器
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年5月21日
 */
public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7777/add", new WebServiceImpl());
	}

}
