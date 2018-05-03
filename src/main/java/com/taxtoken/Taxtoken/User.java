/**
* 
*/
package com.taxtoken.Taxtoken;

/**
 * @author Teja
 *
 */
public class User {
	
	public User(){
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private String birthday;
	private int age;

	public User(String name, String birthday, int age) {
		this.name = name;
		this.birthday = birthday;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	public int getAge() {
		return age;
	}

}
