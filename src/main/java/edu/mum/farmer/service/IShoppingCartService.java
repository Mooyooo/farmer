package edu.mum.farmer.service;

import edu.mum.farmer.entity.LineItem;
import edu.mum.farmer.entity.ShoppingCart;

public interface IShoppingCartService {

	public void addShoppingCart(ShoppingCart shoppingCart);

	public void updateShoppingCart(ShoppingCart shoppingCart);

	public void deleteShoppingCart(long id);

	public ShoppingCart getShoppingCart(long id);

	public void addLineItem(LineItem lineItem);

	public void removeLineItem(LineItem lineItem);
	
	public ShoppingCart getShoppigCartByUsername(String username);
}
