
package server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findAllResponse", namespace = "http://www.sd.yonyou.com")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findAllResponse", namespace = "http://www.sd.yonyou.com")
public class FindAllResponse {

    @XmlElement(name = "return", namespace = "", nillable = true)
    private server.vo.Person[] _return;

    /**
     * 
     * @return
     *     returns Person[]
     */
    public server.vo.Person[] getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(server.vo.Person[] _return) {
        this._return = _return;
    }

}
