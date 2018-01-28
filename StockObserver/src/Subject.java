/*
 * Name: Timsnky
 * 
 * A Subject interface that is used to guide the classes
 * that implement it on the required methods for managing the 
 * observers
 */
public interface Subject {
	
	public void registerObserver(Observer o);
	
	public void removeObserver(Observer o);
	
	public void notifyObservers();
}
