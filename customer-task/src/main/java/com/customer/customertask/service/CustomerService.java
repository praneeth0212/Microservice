package com.customer.customertask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import com.customer.customertask.model.Customer;
import com.customer.customertask.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer -> customers.add(customer));
		return customers;
	}

	public Customer getCustomerById(int id) {
		return customerRepository.findById(id).get();
	}

	public void saveOrUpdate(Customer customer) {
		customerRepository.save(customer);
	}

	public void delete(int id) {
		customerRepository.deleteById(id);
	}
}
