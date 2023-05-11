/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This program helps the user diagnose there wifi problems. 
 * Due: 05/11/2023
   Print your Name here: Harlene Kaur
*/
public class Customer {
	
	String name;
	int age;
	
	public Customer(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	public Customer(Customer c) {
		
		name = c.name;
		age = c.age;
		
	}
	
	public int getAge() {
		
		return age;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String toString() {
		
		return name + "," + age;
		
	}

}