/*
 * Name: Timsnky
 * 
 * FloridaUniversity class that will be used to test the concepts of an
 * ArrayList that will hold the students and a TreeMap that will hold the 
 * course names
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FloridaUniversity {
	
	public static void main(String [] args)
	{
		StudentTest studentTest = new StudentTest(new ArrayList<Student>());
		
		ArrayList<Student> studentsList = studentTest.getStudentsList();
		
		studentsList = addStudents(studentsList);
		
		displayStudents(studentsList);
		
		TreeMap<String, Integer> courses = countCourses(studentsList);
		
		displayCourseEnrollments(courses);
	}
	
	/*
     * Method to add students to the ArrayList<Student>
     *
     * @param  ArrayList<Student>
     * @return ArrayList<Student>
     */
	public static ArrayList<Student> addStudents(ArrayList<Student> studentsList)
	{
		ArrayList<String> courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		Student student = new Student("0433", "Nina", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("SMA2480", "EEE2518", "EEE2408"));
		student = new Student("8197", "Walker", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		student = new Student("0436", "Damon", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("SMA2480", "EEE2518", "EEE2408"));
		student = new Student("0587", "Downing", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("SMA2480", "EEE2518", "EEE2408"));
		student = new Student("0758", "O'Brien", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("ICS2206", "EEE2313", "EEE2405"));
		student = new Student("2740", "Wayne", courseList);
		studentsList.add(student);
		
		courseList = new ArrayList<String>(Arrays.asList("HRD2114", "SMA2272", "EEC2301"));
		student = new Student("2736", "Charles", courseList);
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
	
	/*
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
	
	/*
     * Method to count the number of students enrolled to a course and add the course to the TreeMap<String, Integer>
     *
     * @param  ArrayList<Student>
     * @return TreeMap<String, Integer>
     */
	public static TreeMap<String, Integer> countCourses( ArrayList<Student> studentsList)
	{
		TreeMap<String, Integer> courses = new TreeMap<String, Integer>();
		
		for(Student student : studentsList)
		{
			for(String course : student.getCourseList())
			{
				if(courses.containsKey(course))
				{
					courses.put(course, courses.get(course) + 1);
				}
				else
				{
					courses.put(course, 1);
				}
			}
		}
		
		return courses;
	}
	
	/*
     * Method to courses and their corresponding students enrollment TreeMap<String, Integer>
     *
     * @param  TreeMap<String, Integer>
     * @return none
     */
	public static void displayCourseEnrollments(TreeMap<String, Integer> courses)
	{
		System.out.println("----------- Course Enrollments ----------");
		
		Set courseSet = courses.entrySet();
		
		Iterator coursesIterator = courseSet.iterator();
		
		while(coursesIterator.hasNext())
		{
			Map.Entry course = (Map.Entry) coursesIterator.next();
			
			System.out.println(course.getKey() + " -- " + course.getValue());
		}
	}
}
