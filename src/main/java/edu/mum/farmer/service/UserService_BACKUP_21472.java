package edu.mum.farmer.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
>>>>>>> 27ca3e4f1466e836d1ca9f146bce311d4a0f3b6c
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.Role;
import edu.mum.farmer.entity.User;
import edu.mum.farmer.repository.RoleRepository;
import edu.mum.farmer.repository.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
<<<<<<< HEAD
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void logout(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public User getUser(long id) {
		return userRepository.findOne(id);
	}

	@Override
	public Role getRole(long id) {
		return roleRepository.findOne(id);
=======
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public UserService() {
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUsername(userName);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		Role userRole = roleRepository.findByName("ADMIN");
		user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
>>>>>>> 27ca3e4f1466e836d1ca9f146bce311d4a0f3b6c
	}

}
