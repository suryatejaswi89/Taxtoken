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
	
	@Autowired
	private UserService userService;
	

	/**
	 * Mapping the request for returning the birthday associated with the name
	 * in the path
	 * 
	 */

	@RequestMapping(path = "/{name}/birthday", method = RequestMethod.GET)
public String getBirthday(@PathVariable(value = "name") String name) {
		return userService.getBirthday(name);
	}
	

	/**
	 * Mapping the request for returning the age associates with the name in the
	 * path path
	 * 
	 */

	@RequestMapping(path = "/{name}/age",  method = RequestMethod.GET)
	@ResponseBody
	public int getAge(@PathVariable(value = "name") String name) {
		return userService.getAge(name);
		
	}

	/**
	 * Mapping the request for creating a user from the requestbody
	 * 
	 */
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> createUser(@RequestBody User user) {
		String name = user.getName();
		String birthday = user.getBirthday();
		int age = user.getAge();
		return userService.createUser(name, birthday, age);
	}

	
	@RequestMapping(path = "/user/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<User> updateUser(@PathVariable(value = "name") String name, @RequestBody User user) {
			String birthday = user.getBirthday();
			int age = user.getAge();
			return userService.updateUser(name, birthday, age);
			
		
	}

}
