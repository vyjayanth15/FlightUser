package com.vyjayanth.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vyjayanth.Entity.Passengers;
import com.vyjayanth.Repo.PassengerRepository;

@Service
public class PassengersService {
	
	@Autowired
	PassengerRepository repo;
	
	public void addPassenger(List<Passengers> passengerlist)
	{
		passengerlist.forEach(passenger-> repo.save(passenger));
		
		
	}

	public void addPassengers(Passengers thepass) {
		
		repo.save(thepass);
		
	}

	public void updatePassengers(List<Passengers> listofPassengers) {
		// TODO Auto-generated method stub
		listofPassengers.forEach(passenger-> repo.save(passenger));
	}

	public void deletePassenegrById(Integer pid) {
		// TODO Auto-generated method stub
		repo.deleteById(pid);
	}
	
	

}

