
/**
 * @author Timsnky
 * 
 * Registrar class that will be tested by the TestRegistrar class
 * on all the methods it contains.
 */
public class Registrar 
{
	private boolean override = false;
	
	void setOverride ( boolean value)
	{
		override = value;
	}
	
	boolean canRegister( int credits, double gpa)
	{
		if( override)
		{
			return true;
		}
		else if( credits > 20)
		{
			return false;
		}
		else if( gpa < 2.0)
		{
			return false;
		}
		else if( gpa >= 3.0 && credits <= 20)
		{
			return true;
		}
		else
		{
			return (gpa >= 2.0 && gpa < 3.0 && credits < 16);
		}
	}
}
