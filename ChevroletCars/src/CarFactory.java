/*
 * Name: @Timsnky
 * 
 * CarFactory class that represents factory design pattern whose work
 * is to determine the correct package factory class that will be returned
 * based on the input
 */
public class CarFactory implements CarPackageManager {

	@Override
	public RegionManager getCar(String carPackage) {
		if(carPackage == null)
		{
			return null;
		}
		else if(carPackage.equalsIgnoreCase("Luxury"))
		{
			return new LuxuryFactory();
		}
		else if(carPackage.equalsIgnoreCase("Performance"))
		{
			return  new PerformanceFactory();
		}
		
		return null;
	}
}
