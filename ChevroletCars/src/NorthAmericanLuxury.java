/*
 * Name: @Timsnky
 * 
 * NorthAmericanLuxury class that represents an north american luxury car and 
 * has the method to output the features for an north american luxury car
 */
public class NorthAmericanLuxury implements CarFeatures {

	@Override
	public void getFeatures() {
		System.out.println("NorthAmerican Luxury Car Features: ");
		System.out.println(" - Upgraded Radio");
		System.out.println(" - Proximity Key Lock System");
		System.out.println(" - Automatic Transmission\n");
	}
}
