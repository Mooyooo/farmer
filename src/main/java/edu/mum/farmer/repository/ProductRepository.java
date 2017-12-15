package edu.mum.farmer.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
