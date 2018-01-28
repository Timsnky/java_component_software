import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Timsnky
 * 
 * The StudentTest class that we will use to test the addition
 * of students to a list and display of students in the list in a sorted
 * manner
 *
 */
public class StudentTest 
{
	private ArrayList<Student> studentsList;
	
	public static void main(String [] args)
	{
		new StudentTest(new ArrayList<Student>());
	}
	
	public StudentTest(ArrayList<Student> studentsList)
	{
		this.studentsList = studentsList;
		this.studentsList = addStudents(this.studentsList);
		
		displayStudents(this.studentsList);
	}

	public ArrayList<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(ArrayList<Student> studentsList) {
		this.studentsList = studentsList;
	}
	
	/**
     * Method to add students to the ArrayList<Student>
     *
     * @param  ArrayList<Student>
     * @return ArrayList<Student>
     */
	public static ArrayList<Student> addStudents(ArrayList<Student> studentsList)
	{
		ArrayList<String> courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		Student student = new Student("4338", "Ian", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("SMA2480", "EEE2518", "EEE2408"));
		student = new Student("0578", "Harry", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		student = new Student("5467", "Shawn", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("SMA2480", "EEE2518", "EEE2408"));
		student = new Student("8410", "Angel", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("SMA2480", "EEE2518", "EEE2408"));
		student = new Student("3425", "Cliff", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		student = new Student("9803", "Samantha", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("HRD2114", "SMA2272", "EEC2301"));
		student = new Student("2134", "Charles", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("HRD2114", "SMA2272", "EEC2301"));
		student = new Student("1460", "Long", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		student = new Student("0585", "Samuel", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("HRD2114", "SMA2272", "EEC2301"));
		student = new Student("8205", "Parker", courseList);
		studentsList.add(student);
		
		return studentsList;
	}
	
	/**
     * Method to display all the students details for the students stored in the ArrayList<Student>
     * The method first does a sort of the students based on the lastName before display
     *
     * @param  ArrayList<Student>
     * @return none
     */
	public static void displayStudents(ArrayList<Student> studentsList)
	{
		Collections.sort(studentsList);
		
		for(Student student : studentsList)
		{
			System.out.print(student.getId() + ", ");
			System.out.print(student.getLastName() + "\t");
			System.out.println(student.getCoursesString());
		}
	}
}