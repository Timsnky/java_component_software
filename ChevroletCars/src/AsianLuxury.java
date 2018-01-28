/*
 * Name: @Timsnky
 * 
 * AsianLuxury class that represents an asian luxury car and 
 * has the method to output the features for an asian luxury car
 */
public class AsianLuxury implements CarFeatures {

	@Override
	public void getFeatures() {
		System.out.println("Asian Luxury Car Features: ");
		System.out.println(" - Automatic Sunroof");
		System.out.println(" - All-Wheel Drive");
		System.out.println(" - Diesel Powertrain\n");
	}
}