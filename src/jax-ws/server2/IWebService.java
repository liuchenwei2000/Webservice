/**
 * 
 */
package server2;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * webservice�Ľӿ���
 * 
 * @author ����ΰ
 * 
 * �������ڣ�2014��5��21��
 */
@WebService
public interface IWebService {

	/**
	 * ��ʶ����ֵ������Ϊ"addResult"������Ĳ�������Ϊ"a"��"b"������ͻ��˵��úͽ���
	 */
	@WebResult(name="addResult")
	public int add(@WebParam(name="a")int a,@WebParam(name="b")int b);
}
