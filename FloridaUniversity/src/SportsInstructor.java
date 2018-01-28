

/**
 * @author Timsnky
 * 
 * A sports instructor responsibility decorator 
 */

public class SportsInstructor extends ResponsibilityDecorator {
	
	Employee employee;
	
	public SportsInstructor(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Sports Instructor, ";
	}
}