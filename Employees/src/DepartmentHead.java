
public class DepartmentHead extends ResponsibilityDecorator {
	
	Employee employee;
	
	public DepartmentHead(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return employee.getDescription() + "Department Head, ";
	}
}
