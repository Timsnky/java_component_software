

/**
 * @author Timsnky
 * 
 * A librarian responsibility decorator 
 */

public class Librarian extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Librarian(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Librarian, ";
	}
}