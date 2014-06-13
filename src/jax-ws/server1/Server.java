/**
 * 
 */
package server1;

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
		// 使用指定地址发布一个webservice，动态生成webservice所需的各种文件
		Endpoint.publish("http://localhost:8888/helloworld", new WebServiceImpl());
	}
}
