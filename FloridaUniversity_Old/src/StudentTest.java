/*
 * Name: Timsnky
 * 
 * StudentTest class that will hold the arraylist that contains all the
 * students that enroll in the university
 */
import java.util.ArrayList;

public class StudentTest {
	
	private ArrayList<Student> studentsList;
	
	public StudentTest(ArrayList<Student> studentsList)
	{
		this.studentsList = studentsList;
	}

	public ArrayList<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(ArrayList<Student> studentsList) {
		this.studentsList = studentsList;
	}
}
