package xml_parsers_json_jackson.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Branch {
    @XmlElement(name = "country")
    private String country;
    @XmlElement(name = "city")
    private String city;

    @XmlElement(name = "employees_number")
    private int employeesNumber;
}
