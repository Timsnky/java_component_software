
/**
 * @author @Timsnky
 * 
 * An accountats responsibility decorator 
 */

public class Accountant extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Accountant(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Accountant, ";
	}
}
