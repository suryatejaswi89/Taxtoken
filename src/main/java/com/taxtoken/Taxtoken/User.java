	/**
 * 
 */
package com.taxtoken.Taxtoken;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author Teja
 *
 */
public class User {
	
	private String name;
	private String birthday;
	private int age;
	
	
	public User(String name, String birthday,int age){
		this.name = name;
		this.birthday = birthday;
		this.age=age;
		
	}
	
	public String getName(){
		return name;
	}
	
	public String getBirthday(){
		return birthday;
	}
	public int getAge(){
		return age;
	}

}
