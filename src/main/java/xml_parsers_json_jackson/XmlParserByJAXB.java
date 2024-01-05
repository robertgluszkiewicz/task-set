package xml_parsers_json_jackson;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import xml_parsers_json_jackson.model.Bank;
import xml_parsers_json_jackson.model.Employee;

public class XmlParserByJAXB {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("src/main/resources/bank.xml");

            JAXBContext jaxbContext = null;
            try {
                jaxbContext = JAXBContext.newInstance(Bank.class);
            } catch (JAXBException e) {
                throw new RuntimeException(e);
            }
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Bank bank = (Bank) jaxbUnmarshaller.unmarshal(xmlFile);


            System.out.println("Employees:");
            for (Employee employee : bank.getEmployees()) {
                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
                System.out.println("Birth Date: " + employee.getBirthDate());
                System.out.println("------------------------");
            }
        } catch (JAXBException e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }
}
