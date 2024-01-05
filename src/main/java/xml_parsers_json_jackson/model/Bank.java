package xml_parsers_json_jackson.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "bank")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bank {
    @XmlElementWrapper(name = "employees")
    @XmlElement(name = "employee")
    private List<Employee> employees;

    @XmlElementWrapper(name = "departments")
    @XmlElement(name = "department")
    private List<Department> departments;

    @XmlElementWrapper(name = "accounts")
    @XmlElement(name = "account")
    private List<Account> accounts;

    @XmlElementWrapper(name = "cards")
    @XmlElement(name = "card")
    private List<Card> cards;

    @XmlElementWrapper(name = "branches")
    @XmlElement(name = "branch")
    private List<Branch> branches;

    public List<Employee> getEmployees() {
        return employees;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public List<Card> getCards() {
        return cards;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public Bank() {
    }
}
