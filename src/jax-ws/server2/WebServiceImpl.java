/**
 * 
 */
package server2;

import javax.jws.WebService;

/**
 * webservice��ʵ����
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��5��21��
 */
@WebService(endpointInterface="server2.IWebService")
public class WebServiceImpl implements IWebService {

	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
