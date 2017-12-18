package edu.mum.farmer.service;

<<<<<<< HEAD
<<<<<<< HEAD
import edu.mum.farmer.entity.Role;
import edu.mum.farmer.entity.User;

public interface IUserService {
	public void login(User user);
	public void createUser(User user);
	public User getUserByUsername(String username);
	public void logout(User user);
	public User getUser(long id);
	public void delete(User user);
	public Role getRole(long id);
=======
=======
>>>>>>> 27ca3e4f1466e836d1ca9f146bce311d4a0f3b6c
import edu.mum.farmer.entity.User;

public interface IUserService {
	public User findByUserName(String userName);

	public void saveUser(User user);
<<<<<<< HEAD
>>>>>>> 27ca3e4f1466e836d1ca9f146bce311d4a0f3b6c
=======
>>>>>>> 27ca3e4f1466e836d1ca9f146bce311d4a0f3b6c
}
