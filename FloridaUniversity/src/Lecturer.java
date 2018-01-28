
/**
 * @author Timsnky
 * 
 * A lecturer responsibility decorator 
 */

public class Lecturer extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Lecturer(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Lecturer, ";
	}
}
