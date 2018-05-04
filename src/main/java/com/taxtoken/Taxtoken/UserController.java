package com.taxtoken.Taxtoken;

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

	/**
	 * Mapping the request for returning the birthday associated with the name in the
	 * path
	 * 
	 */

	@RequestMapping(path = "/{name}/birthday")
	public String getBirthday(@PathVariable(value = "name") String name) {

		return users.findBirthday(name);
	}
	
	/**
	 * Mapping the request for returning the age associates with the name in the path
	 * path
	 * 
	 */
	
	@RequestMapping(path="/{name}/age")
	public int getAge(@PathVariable(value="name") String name){
		return users.returnAge(name);
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<User> saveUser(@RequestBody User user){
		users.userList.add(user);
		return new ResponseEntity<User>(users.userList.get(users.userList.size()-1),HttpStatus.OK);
	}
	
	@RequestMapping(path="/user/{name}", method = RequestMethod.PUT)
	@ResponseBody
	public ResponseEntity<User> updateUser(@PathVariable(value="name") String name, @RequestBody User user){
		User user1 = users.findUser(name);
		user1.setBirthday(user.getBirthday());
		user1.setAge(user.getAge());
		return new ResponseEntity<User>(user1,HttpStatus.OK);
	}

}
