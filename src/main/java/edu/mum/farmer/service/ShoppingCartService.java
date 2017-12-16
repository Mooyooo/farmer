package edu.mum.farmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.LineItem;
import edu.mum.farmer.entity.ShoppingCart;
import edu.mum.farmer.repository.ShoppingCartRepository;

@Service
public class ShoppingCartService implements IShoppingCartService {

	@Autowired
	ShoppingCartRepository shoppingCartRepository;

	@Override
	public void addShoppingCart(ShoppingCart shoppingCart) {
		shoppingCartRepository.save(shoppingCart);
	}

	@Override
	public void updateShoppingCart(ShoppingCart shoppingCart) {
		shoppingCartRepository.save(shoppingCart);
	}

	@Override
	public void deleteShoppingCart(long id) {
		shoppingCartRepository.delete(id);
	}

	@Override
	public ShoppingCart getShoppingCart(long id) {
		return shoppingCartRepository.findOne(id);
	}

	@Override
	public void addLineItem(LineItem lineItem) {
		
	}

	@Override
	public ShoppingCart removeLineItem(LineItem lineItem) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
