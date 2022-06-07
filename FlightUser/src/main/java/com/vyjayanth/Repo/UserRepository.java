package com.vyjayanth.Repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vyjayanth.Entity.User;



@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public User findByUseremail(String useremail);
	public User findByUsername(String username);
	Boolean existsByUsername(String username);

	Boolean existsByUseremail(String email);

}
