
/**
 * @author Timsnky
 * 
 * A chaplains responsibility decorator 
 */

public class Chaplain extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Chaplain(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Chaplain, ";
	}
}
