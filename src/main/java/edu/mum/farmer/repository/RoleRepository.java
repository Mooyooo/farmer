package edu.mum.farmer.repository;

import org.springframework.data.repository.CrudRepository;

import edu.mum.farmer.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	public Role findByName(String name);
}
