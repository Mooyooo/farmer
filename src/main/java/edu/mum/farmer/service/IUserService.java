package edu.mum.farmer.service;

import edu.mum.farmer.entity.Role;
import edu.mum.farmer.entity.User;

public interface IUserService {
	public User findByUserName(String userName);
	public void login(User user);
	public void createUser(User user);
	public User getUserByUsername(String username);
	public void logout(User user);
	public User getUser(long id);
	public void delete(User user);
	public Role getRole(long id);
}
