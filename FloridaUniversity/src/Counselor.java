
/**
 * @author Timsnky
 * 
 * A counseller responsibility decorator 
 */

public class Counselor extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Counselor(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Counselor, ";
	}
}