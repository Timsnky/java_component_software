/**
 * @author Timsnky
 * 
 * Employee class which is the abstract clasd that will
 * be used to represent the required details for an employee
 */

public abstract class Employee {
	
	public String lastName;
	
	String description;
	
	/*
	 * Getter method to return the description for the class
	 */
	public String getDescription()
	{
		return this.lastName + ": ";
	}	
}
