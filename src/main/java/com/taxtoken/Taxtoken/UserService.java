package com.taxtoken.Taxtoken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public String getBirthday(String name){
		User user = userRepo.findByName(name);
		return user.getBirthday();
	}
	
	public int getAge(String name){
		User user = userRepo.findByName(name);
		return user.getAge();
	}
	
	public ResponseEntity<User> createUser(String name, String birthday, int age){
		User user = new User();
		user.setName(name);
		user.setBirthday(birthday);
		user.setAge(age);
		if(userRepo.existsByName(name)){
			return new ResponseEntity<User>(user, HttpStatus.CONFLICT);
		}
		else{
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
		}	
	}
	
	public ResponseEntity<User> updateUser(String name, String birthday, int age){
		User user = userRepo.findByName(name);
		user.setBirthday(birthday);
		user.setAge(age);
		userRepo.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
