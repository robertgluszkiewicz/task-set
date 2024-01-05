package xml_parsers_json_jackson.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Department {
    @XmlElement(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public Department() {
    }
}
