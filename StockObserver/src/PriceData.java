/*
 * Name: Timsnky
 * 
 * A PriceData class which implements the Subject
 * interface which represent our stocks data that will
 * be observed by the registered observers. The class implements
 * the method required to manage the observers and notify the 
 * appropriately when data changes
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PriceData implements Subject {
	
	private Map<String, Double> prices;
	private ArrayList<Observer> observers;
	
	public PriceData()
	{
		this.observers = new ArrayList<Observer>();
		this.prices = new HashMap<String,Double>();
	}

	public Map<String, Double> getPrices() {
		return prices;
	}
	
	public void updatePrices(Map<String, Double> stocks)
	{
		this.prices = stocks;
	}

	public void setPrices(Map<String, Double> stocks) 
	{
		for(String key : stocks.keySet())
		{
			prices.put(key, stocks.get(key));
		}
		
		stockPricesChanged();
	}
	
	public void stockPricesChanged()
	{
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer o) 
	{
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) 
	{
		int i = observers.indexOf(o);
		
		if(i >= 0)
		{
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() 
	{
		for(Observer observer : this.observers)
		{
			observer.updateStocks(this.prices);
		}	
		System.out.println();
	}
}
