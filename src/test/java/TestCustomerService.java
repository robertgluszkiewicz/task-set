import java.sql.SQLException;

import org.testng.annotations.Test;

import homework.bank.dao.CustomerDao;
import homework.bank.service.CustomerService;

public class TestCustomerService {
    @Test
    void testCustomerService() throws SQLException {
        CustomerDao cd = new CustomerDao();
        CustomerService cs = new CustomerService(cd);
        cs.getById(14);
    }
}
