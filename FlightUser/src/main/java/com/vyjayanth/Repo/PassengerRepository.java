package com.vyjayanth.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vyjayanth.Entity.Passengers;



@Repository
public interface PassengerRepository extends CrudRepository<Passengers, Integer>{

}
