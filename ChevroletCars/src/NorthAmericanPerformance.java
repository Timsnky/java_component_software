/*
 * Name: @Timsnky
 * 
 * NorthAmericanPerformance class that represents an north american performance car and 
 * has the method to output the features for an north american performance car
 */
public class NorthAmericanPerformance implements CarFeatures {

	@Override
	public void getFeatures() {
		System.out.println("NorthAmerican Performance Car Features: ");
		System.out.println(" - Twin Clutch Sportronic Shift Transmission");
		System.out.println(" - Electronic Stability Control");
		System.out.println(" - Traction Control System\n");
	}
}
