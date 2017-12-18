package edu.mum.farmer.service;

import edu.mum.farmer.entity.User;

public interface IUserService {
	public User findByUserName(String userName);

	public void saveUser(User user);
}
