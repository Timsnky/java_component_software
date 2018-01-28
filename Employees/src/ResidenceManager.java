
public class ResidenceManager extends ResponsibilityDecorator {
	
	Employee employee;
	
	public ResidenceManager(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Residence Manager, ";
	}
}
