

/**
 * @author Timsnky
 * 
 * A dean responsibility decorator 
 */

public class Manager extends ResponsibilityDecorator{

	Employee employee;
	
	public Manager(Employee employee)
	{
		this.employee = employee;
	}
	
	@Override
	public String getDescription() 
	{
		return employee.getDescription() + "Manager, ";
	}
}
