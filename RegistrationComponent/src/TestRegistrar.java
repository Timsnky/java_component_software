import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author Timsnky
 * 
 * TestRegistrar class that will be used to perform the unit
 * test on the methods in the Registrar class for the specified
 * scenarios.
 *
 */
public class TestRegistrar 
{
	/*
	 * Case 1 Test for when a student can register when
	 * they have an advisor override irrespective of the gpa and credits
	 */
	@Test
	public void testCanRegister_1() 
	{
		//New rule: student with gpa < 2.0 cannot register
		//without advisor override
		Registrar R = new Registrar();
		R.setOverride(true);
		boolean actual = R.canRegister(1, 1.99);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Case 2 Test for when a student shouldn't register if 
	 * they have a gpa of less than 2 without an advisor override
	 */
	@Test
	public void testCanRegister_2() 
	{
		//New rule: student with gpa < 2.0 cannot register
		//without advisor override
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(1, 1.99);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}

	/*
	 * Case 3 Test for when a student can register if the have a gpa
	 * of between 2.0 and 3.0 or they have less than 16 credits without the advisor override
	 */
	@Test
	public void testCanRegister_3() 
	{
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(16, 2.99);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Case 4 Test for when a student can register if they have a gpa
	 * of greater than or equal to 3 or credits of less than or equal to 20 without an advisor overried
	 */
	@Test
	public void testCanRegister_4() 
	{
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(16, 3.0);
		boolean expected = true;
		
		assertEquals(expected, actual);
	}
	
	/*
	 * Case 5 Test for when a student shouldn't register when 
	 * they have more than 20 credits without an advisor override
	 */
	@Test
	public void testCanRegister_5() 
	{
		//New rule: student with gpa < 2.0 cannot register
		//without advisor override
		Registrar R = new Registrar();
		R.setOverride(false);
		boolean actual = R.canRegister(21, 3.0);
		boolean expected = false;
		
		assertEquals(expected, actual);
	}

}
