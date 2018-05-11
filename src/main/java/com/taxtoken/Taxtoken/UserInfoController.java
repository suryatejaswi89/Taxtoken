package com.taxtoken.Taxtoken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserInfoController {
Usermodel users = new Usermodel();
	
	@Autowired
	private UserRepository userRepo;
	@RequestMapping(path="/user/{name}", method = RequestMethod.GET)
	//@ResponseBody
	public String showUser(@PathVariable(value="name") String name, Model model){
		User user1 = userRepo.findByName(name);
		model.addAttribute("name", user1.getName());
		model.addAttribute("birthday", user1.getBirthday());
		model.addAttribute("age", user1.getAge());
		return "userinfo";
	}
}
