package edu.mum.farmer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.Product;
import edu.mum.farmer.entity.ProductState;

public interface ProductRepository extends CrudRepository<Product, Long> {

	public List<Product> getProductByProductState(ProductState productState);

}
