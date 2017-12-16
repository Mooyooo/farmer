package edu.mum.farmer.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
	public User findByUsername(String username);
}
