package com.customer.customertask.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.customer.customertask.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import com.customer.customertask.service.CustomerService;
import java.util.List;

@RestController
public class Customercontroller {
	@Autowired
	CustomerService customerService;

	@GetMapping("/customer")
	private List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}

	@GetMapping("/customer/{id}")
	private Customer getcustomer(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}

	@DeleteMapping("/customer/{id}")
	private void deleteCustomer(@PathVariable("id") int id) {
		customerService.delete(id);
	}

	@PostMapping("/customer")
	private int saveCustomer(@RequestBody Customer customer) {
		customerService.saveOrUpdate(customer);
		return customer.getId();
	}

}
