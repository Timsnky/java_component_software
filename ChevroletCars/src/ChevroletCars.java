/*
 * Name: @Timsnky
 * 
 * ChevroletCars class that will be used to test our factory design
 * pattern to see its working
 */
public class ChevroletCars {
	
	public static void main (String [] args)
	{
		CarFactory $carFactory = new CarFactory() ;
		
		RegionManager $package1 = $carFactory.getCar("Luxury");
		CarFeatures $car1 = $package1.getRegion("Asian");
		$car1.getFeatures();
		
		RegionManager $package2 = $carFactory.getCar("Luxury");
		CarFeatures $car2 = $package2.getRegion("Europe");
		$car2.getFeatures();
		
		RegionManager $package3 = $carFactory.getCar("Luxury");
		CarFeatures $car3 = $package3.getRegion("North America");
		$car3.getFeatures();
		
		RegionManager $package4 = $carFactory.getCar("Performance");
		CarFeatures $car4 = $package4.getRegion("Asian");
		$car4.getFeatures();
		
		RegionManager $package5 = $carFactory.getCar("Performance");
		CarFeatures $car5 = $package5.getRegion("Europe");
		$car5.getFeatures();
		
		RegionManager $package6 = $carFactory.getCar("Performance");
		CarFeatures $car6 = $package6.getRegion("North America");
		$car6.getFeatures();
	}
}
