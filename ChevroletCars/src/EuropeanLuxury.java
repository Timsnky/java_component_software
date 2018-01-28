/*
 * Name: @Timsnky
 * 
 * EuropeanLuxury class that represents an european luxury car and 
 * has the method to output the features for an european luxury car
 */
public class EuropeanLuxury implements CarFeatures {

	@Override
	public void getFeatures() {
		System.out.println("European Luxury Car Features: ");
		System.out.println(" - Aluminium Wheels");
		System.out.println(" - Telematics Systems");
		System.out.println(" - Hybrid Powertrains\n");
	}
}
