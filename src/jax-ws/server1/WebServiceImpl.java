/**
 * 
 */
package server1;

import javax.jws.WebService;

/**
 * webservice��ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��5��21��
 */
@WebService(endpointInterface="server1.IWebService")
public class WebServiceImpl implements IWebService {

	@Override
	public String sayHello() {
		System.out.println("response");
		return "Hello world";
	}
}
