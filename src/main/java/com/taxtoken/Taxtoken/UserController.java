package com.taxtoken.Taxtoken;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping(path = "/{name}/birthday/")
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

}
