package edu.iu.p565.customer.service.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import edu.iu.p565.customer.service.model.Customer;

@Repository
public class CustomerRepository {

    private List<Customer> customers = new ArrayList<>();

    public List<Customer> findAll() {

        return customers;
    }

    public int create(Customer customer){
        int id = customers.size() + 1;
        customer.setId(id);
        customers.add(customer);
        return id;

    }


    
}
