
public class CommunityLiaison extends ResponsibilityDecorator {
	
	Employee employee;
	
	public CommunityLiaison(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Community Liaison, ";
	}
}