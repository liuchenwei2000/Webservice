/**
 * 
 */
package server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import server.vo.Person;

/**
 * 
 * 
 * @author 刘晨伟
 * 
 * 创建日期：2013-8-26
 */
@WebService(name="ncService",  portName="ncServicePort", targetNamespace="http://www.sd.yonyou.com")
public class NCService {

	private static int id = 0;
	
	@WebMethod
	public Person find(String name){
		// query DB
		Person person = new Person(generateID(), name);
		person.setBirthday(new Date());
		return person;
	}
	
	private static String generateID(){
		return String.valueOf(++id);
	}
	
	@WebMethod
	public Person[] findAll() {
		List<Person> persons = new ArrayList<Person>();
		for (int i = 0; i < 5; i++) {
			Person person = new Person(generateID(), "name_" + i);
			person.setBirthday(new Date());
			persons.add(person);
		}
		return persons.toArray(new Person[0]);
	}
}