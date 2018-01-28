/*
 * Name: @Timsnky
 * 
 * PerformanceFactory class used to create CarFeatures classes based on the
 * supplied region under the performance package
 */
public class PerformanceFactory implements RegionManager {
	
	@Override
	public CarFeatures getRegion(String region) 
	{
		if(region == null)
		{
			return null;
		}
		else if(region.equalsIgnoreCase("Asian"))
		{
			return new AsianPerformance();
		}
		else if(region.equalsIgnoreCase("Europe"))
		{
			return new EuropeanPerformance();
		}
		else if(region.equalsIgnoreCase("North America"))
		{
			return new NorthAmericanPerformance();
		}
		
		return null;	
	}
}
