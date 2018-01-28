/*
 * Name:@Timsnky
 * 
 * AsianPerformance class that represents an asian performance car and 
 * has the method to output the features for an asian performance car
 */
public class AsianPerformance implements CarFeatures {

	@Override
	public void getFeatures() {
		System.out.println("Asian Performance Car Features: ");
		System.out.println(" - Twin Precision Ball Bearing Turbocharger with Intercooling");
		System.out.println(" - Dual Exhaust System");
		System.out.println(" - 6 Speed Manual Transmission\n");
	}
}
