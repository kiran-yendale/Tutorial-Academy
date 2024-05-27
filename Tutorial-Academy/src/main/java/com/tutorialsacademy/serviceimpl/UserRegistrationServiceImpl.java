package com.tutorialsacademy.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialsacademy.dto.UserDetailsDto;
import com.tutorialsacademy.entity.UserDetailsEntity;
import com.tutorialsacademy.repo.UserDetailsRepo;
import com.tutorialsacademy.service.UserRegisterService;

@Service
public class UserRegistrationServiceImpl implements UserRegisterService{

	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	@Override
	public String userRegistration(UserDetailsDto userDerails) {
		UserDetailsEntity userDetailsentity=new UserDetailsEntity();
		
		userDetailsentity.setFirstName(userDerails.getFirstName());
		userDetailsentity.setLastName(userDerails.getLastName());
		userDetailsentity.setCity(userDerails.getCity());
		userDetailsentity.setState(userDerails.getState());
		userDetailsentity.setAge(userDerails.getAge());
		userDetailsentity.setEmail(userDerails.getEmail());
		userDetailsentity.setPassword(userDerails.getPassword());
		userDetailsentity.setPhone(userDerails.getPhone());
			
		userDetailsRepo.save(userDetailsentity);
		return "registered success";
	}

}
