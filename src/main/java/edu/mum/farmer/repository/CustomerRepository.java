package edu.mum.farmer.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.Client;

public interface CustomerRepository extends CrudRepository<Client, Long> {
}
