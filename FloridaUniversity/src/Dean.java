
/**
 * @author Timsnky
 * 
 * A dean responsibility decorator 
 */

public class Dean extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Dean(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Dean of Students, ";
	}
}

