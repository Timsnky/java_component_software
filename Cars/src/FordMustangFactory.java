/*
 * Name: @Timsnky
 * 
 * FordMustangFactory class used to create CarFeatures classes based on the
 * supplied region under the performance package
 */
public class FordMustangFactory implements RegionManager {
	
	@Override
	public CarFeatures getRegion(String region) 
	{
		if(region == null)
		{
			return null;
		}
		else if(region.equalsIgnoreCase("Asian"))
		{
			return new AsianFordMustang();
		}
		else if(region.equalsIgnoreCase("Europe"))
		{
			return new EuropeanFordMustang();
		}
		else if(region.equalsIgnoreCase("North America"))
		{
			return new NorthAmericanFordMustang();
		}
		
		return null;	
	}
}
