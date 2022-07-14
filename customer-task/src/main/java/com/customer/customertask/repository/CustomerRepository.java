package com.customer.customertask.repository;

import org.springframework.data.repository.CrudRepository;

import com.customer.customertask.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
