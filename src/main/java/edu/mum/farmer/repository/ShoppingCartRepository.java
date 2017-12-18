package edu.mum.farmer.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {
	// public void addLineItem(LineItem lineItem);
	ShoppingCart getShoppingCartByClientUsername(String username);
}
