
/**
 * @author Timsnky
 * 
 * A safety cordinator responsibility decorator 
 */

public class SafetyCordinator extends ResponsibilityDecorator {
	
	Employee employee;
	
	public SafetyCordinator(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Safety Cordinator, ";
	}
}
