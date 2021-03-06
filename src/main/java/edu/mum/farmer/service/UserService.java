package edu.mum.farmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import edu.mum.farmer.entity.Role;
import edu.mum.farmer.entity.User;
import edu.mum.farmer.repository.RoleRepository;
import edu.mum.farmer.repository.UserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
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
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUsername(userName);
	}

	@Override
	public Role getRoleByName(String roleName) {
		return roleRepository.findByName(roleName);
	}
}