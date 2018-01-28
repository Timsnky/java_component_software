/**
 * @author Timsnky
 * 
 * FloriddaUniversity class to be used to demonstrate the 
 * the application of decorator patter in addition of roles
 * to employees.
 */

public class FloridaUniversity {
	public static void main(String [] args)
	{
		Employee employee1 = new SalariedEmployee("Nabit");
		employee1 = new Dean(employee1);
		employee1 = new Recruiter(employee1);
		employee1 = new SafetyCordinator(employee1);
		System.out.println(employee1.getDescription());
		
		Employee employee2 = new SalariedEmployee("Alqasim");
		employee2 = new DepartmentHead(employee2);
		employee2 = new Lecturer(employee2);
		employee2 = new SportsInstructor(employee2);
		System.out.println(employee2.getDescription());
		
		Employee employee3 = new SalariedEmployee("John");
		employee3 = new Chaplain(employee3);
		employee3 = new Counselor(employee3);
		employee3 = new CommunityLiaison(employee3);
		System.out.println(employee3.getDescription());
		
		Employee employee4 = new SalariedEmployee("Mildred");
		employee4 = new ResidenceManager(employee4);
		System.out.println(employee4.getDescription());
		
		Employee employee5 = new SalariedEmployee("Albert");
		employee5 = new Accountant(employee5);
		System.out.println(employee5.getDescription());
		
		Employee employee6 = new SalariedEmployee("Natalie");
		employee6 = new Librarian(employee6);
		System.out.println(employee6.getDescription());
	}
}
