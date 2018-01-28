/*
 * Name: @Timsnky
 * 
 * LuxuryFactory class that is used to create the desired classes based on the 
 * supplied region input
 */
public class LuxuryFactory implements RegionManager {
	
	@Override
	public CarFeatures getRegion(String region) 
	{
		if(region == null)
		{
			return null;
		}
		else if(region.equalsIgnoreCase("Asian"))
		{
			return new AsianLuxury();
		}
		else if(region.equalsIgnoreCase("Europe"))
		{
			return new EuropeanLuxury();
		}
		else if(region.equalsIgnoreCase("North America"))
		{
			return new NorthAmericanLuxury();
		}
		
		return null;	
	}
}
