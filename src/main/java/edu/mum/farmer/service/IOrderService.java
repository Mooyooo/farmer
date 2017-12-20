package edu.mum.farmer.service;

import java.util.List;

import edu.mum.farmer.entity.Order;

public interface IOrderService {
	public List<Order> getAllOrders();

	public Order getOrder(long id);

	public void addOrder(Order order);

	public void updateOrder(Order order);

	public void deleteOrder(long id);

	public List<Order> getOrderByUsername(String username);

}
