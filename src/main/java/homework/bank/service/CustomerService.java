package homework.bank.service;

import java.sql.SQLException;
import java.util.Collection;

import homework.bank.dao.CustomerDao;
import homework.bank.model.Customer;

public class CustomerService implements Service<Customer, Integer> {
    private CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public Collection<Customer> getAll() throws SQLException {
        return customerDao.getAll();
    }

    @Override
    public Customer getById(Integer customerId) throws SQLException {
        Customer customer = customerDao.getEntityById(customerId);
        if (customer == null) {
            System.out.println("Customer ID = " + customerId + " not found");
        } else {
            System.out.println("Customer ID = " + customerId + " found: " + customer.getFirstName() + " " + customer.getLastName());
        }
        return customer;
    }

    @Override
    public boolean save(Customer customer) {
        return customerDao.insert(customer);
    }

    @Override
    public void update(Customer newCustomer, Integer id) {
        customerDao.update(newCustomer, id);
    }

    @Override
    public boolean delete(Integer id) {
        return customerDao.delete(id);
    }
}
