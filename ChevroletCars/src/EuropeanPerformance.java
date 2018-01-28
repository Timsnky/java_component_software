/*
 * Name: @Timsnky
 * 
 * EuropeanPerformance class that represents an european performance car and 
 * has the method to output the features for an european performance car
 */
public class EuropeanPerformance implements CarFeatures {

	@Override
	public void getFeatures() {
		System.out.println("European Performance Car Features: ");
		System.out.println(" - 1500 Horsepower");
		System.out.println(" - Carbon Fiber Frame");
		System.out.println(" - Michelin Pilot Super Sport Tires\n");
	}
}
