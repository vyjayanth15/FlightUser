package com.vyjayanth.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyjayanth.Entity.User;
import com.vyjayanth.Repo.UserRepository;



@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public Iterable<User> getAllUsers()
	{
		return repo.findAll();
	}
	
	public Optional<User> getUserById(Integer id)
	{
		return repo.findById(id);
	}
	
	public void addNewUser(User newUser)
	{
		repo.save(newUser);
	}

	public String getRolebyEmail(String username) {
		// TODO Auto-generated method stub
		return repo.findByUseremail(username).getRole();
		
		
	}
}
