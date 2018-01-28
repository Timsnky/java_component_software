/*
 * Name: @Timsnky
 * 
 * FordGTFactory class that is used to create the desired classes based on the 
 * supplied region input
 */
public class FordGTFactory implements RegionManager {
	
	@Override
	public CarFeatures getRegion(String region) 
	{
		if(region == null)
		{
			return null;
		}
		else if(region.equalsIgnoreCase("Asian"))
		{
			return new AsianFordGT();
		}
		else if(region.equalsIgnoreCase("Europe"))
		{
			return new EuropeanFordGT();
		}
		else if(region.equalsIgnoreCase("North America"))
		{
			return new NorthAmericanFordGT();
		}
		
		return null;	
	}
}
