package com.taxtoken.Taxtoken;

import java.util.ArrayList;
import java.util.Iterator;

public class Usermodel {

	ArrayList<User> userList = new ArrayList<User>();

	public Usermodel() {

		User tiru = new User("Tiru", "Jun 3 1985", 33);
		User teja = new User("Teja", "Dec 2 1989", 27);
		User aarya = new User("Aarya", "May 12 1998", 20);

		userList.add(tiru);
		userList.add(teja);
		userList.add(aarya);

	}
	
	Iterator<User> itr = userList.iterator();

	/*
	 * Method to return the birthday of the user matching with the name given
	 */

	public String findBirthday(String name) {

		for (int i = 0; i < this.userList.size(); i++) {
			User user = this.userList.get(i);
			if (name.equalsIgnoreCase(user.getName())) {
				return user.getBirthday().toString();
			}

		}
		return "no user found";
	}
	
	
public int returnAge(String name){
		
		for(int i=0;i<this.userList.size();i++){
			User user =this.userList.get(i);
			if(name.equalsIgnoreCase(user.getName())){
				return user.getAge();
			}
			
		}
		return 0;
	}

public User findUser(String name){
	
	for(int i=0;i<this.userList.size();i++){
		User user = this.userList.get(i);
		if(name.equalsIgnoreCase(user.getName())){
			return user;
		}
	}
	return null;
	
}
}
