package edu.mum.farmer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	List<Order> findByClientUsername(String username);
}
