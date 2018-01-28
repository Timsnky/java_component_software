
public class Recruiter extends ResponsibilityDecorator {
	
	Employee employee;
	
	public Recruiter(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Recruiter, ";
	}
}
