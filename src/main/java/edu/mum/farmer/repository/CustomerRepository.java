package edu.mum.farmer.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
