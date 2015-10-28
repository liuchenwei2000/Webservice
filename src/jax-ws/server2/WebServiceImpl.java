/**
 * 
 */
package server2;

import javax.jws.WebService;

/**
 * webservice的实现类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年5月21日
 */
@WebService(endpointInterface="server2.IWebService")
public class WebServiceImpl implements IWebService {

	@Override
	public int add(int a, int b) {
		return a + b;
	}
}
