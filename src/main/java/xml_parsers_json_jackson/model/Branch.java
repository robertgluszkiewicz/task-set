package xml_parsers_json_jackson.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Branch {
    @XmlElement(name = "country")
    private String country;
    @XmlElement(name = "city")
    private String city;

    @XmlElement(name = "employees_number")
    private int employeesNumber;

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public Branch() {
    }
}
