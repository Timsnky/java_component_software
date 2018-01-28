

/**
 * @author Timsnky
 * 
 * A salaried employee class which extends the employee class
 * to get attributes from the employee and introduce additional 
 * attributes specific to a salaried employee
 */

public class SalariedEmployee extends Employee {
	
	public SalariedEmployee(String lastName)
	{
		this.description = "Salaried Employee";
		this.lastName = lastName;
	}

}
