package xml_parsers_json_jackson.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Account {
    @XmlElement(name = "account_id")
    private int accountId;

    @XmlElement(name = "account_number")
    private String accountNumber;

    @XmlElement(name = "balance")
    private double balance;

    public int getAccountId() {
        return accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Account() {
    }
}
