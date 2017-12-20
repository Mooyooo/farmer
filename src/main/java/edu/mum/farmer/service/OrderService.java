package edu.mum.farmer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.Order;
import edu.mum.farmer.repository.OrderRepository;

@Service
public class OrderService implements IOrderService{

	@Autowired
	OrderRepository orderRepository;
	

	@Override
	public Order getOrder(long id) {
		return orderRepository.findOne(id);
	}

	@Override
	public void addOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void updateOrder(Order order) {
		orderRepository.save(order);
	}

	@Override
	public void deleteOrder(long id) {
		orderRepository.delete(id);
	}

	@Override
	public List<Order> getOrderByUsername(String username) {
		return orderRepository.findByClientUsername(username);
	}

	@Override
	public List<Order> getAllOrders() {
		return null;
	}

}
