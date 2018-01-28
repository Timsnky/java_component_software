import java.util.ArrayList;


/**
 * @author Timsnky
 * 
 * Student class to be used to setup the Student object which will
 * contain the id, lastname and courses for a given student. The class
 * implements a comparable interface to enable sorting of students 
 *
 */
public class Student implements Comparable<Student>
{
	private String id;
	private String lastName;
	private ArrayList<String> courseList;
	
	public Student(String id, String lastName, ArrayList<String> courseList)
	{
		this.id = id;
		this.lastName = lastName;
		this.courseList = courseList;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public ArrayList<String> getCourseList() {
		return courseList;
	}

	public void setCourseList(ArrayList<String> courseList) {
		this.courseList = courseList;
	}	
	
	@Override
	public int compareTo(Student student) 
	{
		return this.lastName.compareTo(student.lastName);
	}
	
	/**
     * Method to read the elements contained in the courseList
     * arraylist and return them as one single string for display
     *
     * @param  none
     * @return String
     */
	public String getCoursesString()
	{
		String courseString = "";
		
		for(String course : this.courseList)
		{
			if(this.courseList.indexOf(course) != 0)
			{
				courseString += ", " + course;
			}
			else
			{
				courseString += course;
			}
		}
		
		return courseString;
	}
}
