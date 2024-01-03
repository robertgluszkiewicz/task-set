import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.sql.SQLException;

import org.testng.annotations.Test;

import homework.bank.dao.CustomerDao;
import homework.bank.model.Customer;

public class TestCustomerDao {
    @Test
    void testDbCRUDOperations() throws SQLException {
        CustomerDao customerDao = new CustomerDao();
        Customer testCustomer = new Customer(
                9,
                "TestFirstName",
                "TestLastName",
                "TestPhone",
                "TestEmail");


        //INSERT test
        assertTrue(customerDao.insert(testCustomer));

        //SELECT test
        int customerId = 13;
        assertNotNull(customerDao.getEntityById(customerId));

        //UPDATE test
        testCustomer.setFirstName("UpdatedTestFirstName");
        customerDao.update(testCustomer, customerId);

        //DELETE test
        assertTrue(customerDao.delete(customerId));
        assertNull(customerDao.getEntityById(customerId));
    }
}
