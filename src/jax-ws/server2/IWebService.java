/**
 * 
 */
package server2;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * webservice的接口类
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2014年5月21日
 */
@WebService
public interface IWebService {

	/**
	 * 标识返回值的名称为"addResult"，传入的参数名称为"a"和"b"，方便客户端调用和解析
	 */
	@WebResult(name="addResult")
	public int add(@WebParam(name="a")int a,@WebParam(name="b")int b);
}
