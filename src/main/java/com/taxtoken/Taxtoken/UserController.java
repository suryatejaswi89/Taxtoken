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
	 * Mapping the request for returning the birthday with the parameter in the
	 * path
	 * 
	 */

	@RequestMapping(path = "/{name}/birthday/")
	public String getBirthday(@PathVariable(value = "name") String name) {

		return users.findBirthday(name);
	}

}
