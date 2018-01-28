/*
 * Name: Timsnky
 * 
 * An observer interface which will be implemented by all
 * abserver classes and will bear an updateStocks method that
 * receives a map of stocks and updates on the display
 */
import java.util.Map;

public interface Observer {
	
	public void updateStocks(Map<String, Double> stocks);
}
