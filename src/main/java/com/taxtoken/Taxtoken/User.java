/**
* 
*/
package com.taxtoken.Taxtoken;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Teja
 *
 */
@Entity
public class User {
	
	protected User(){
		
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String birthday;
	private int age;

	public User(String name, String birthday, int age) {
		this.name = name;
		this.birthday = birthday;
		this.age = age;

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
