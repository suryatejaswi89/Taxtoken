package com.taxtoken.Taxtoken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author Teja
 *
 */
@RestController
public class UserController {
	Usermodel users = new Usermodel();
	
	@Autowired
	private UserRepository userRepo;

	/**
	 * Mapping the request for returning the birthday associated with the name in the
	 * path
	 * 
	 */

	@RequestMapping(path = "/{name}/birthday")
	public String getBirthday(@PathVariable(value = "name") String name) {
		User user=userRepo.findByName(name);
		return user.getBirthday();
	}
	
	/**
	 * Mapping the request for returning the age associates with the name in the path
	 * path
	 * 
	 */
	
	@RequestMapping(path="/{name}/age")
	@ResponseBody
	public int getAge(@PathVariable(value="name") String name){
		User user=userRepo.findByName(name);
		return user.getAge();
	}
	
	/**
	 * Mapping the request for creating a user from the requestbody 
	 * 
	 */
	@RequestMapping(value="/user", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> createUser(@RequestBody User user){
		userRepo.save(user);
		return new ResponseEntity<User>(userRepo.save(user),HttpStatus.OK);
	}
	
	
	@RequestMapping(path="/user/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<User> updateUser(@PathVariable(value="name") String name, @RequestBody User user){
		User user1=userRepo.findByName(name);
		user1.setBirthday(user.getBirthday());
		user1.setAge(user.getAge());
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}
	

}
