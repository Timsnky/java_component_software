/*
 * Name: Timsnky
 * 
 * A PriceData class which implements the Subject
 * interface which represent our stocks data that will
 * be observed by the registered observers. The class implements
 * the method required to manage the observers and notify the 
 * appropriately when data changes
 */

import java.util.Map;

public class PricesDisplay implements Observer, DisplayElement 
{
	private String portfolioId;
	private PriceData priceData;
	private String [] stocks;
	
	public PricesDisplay(String portfolioId, PriceData priceData)
	{
		this.portfolioId = portfolioId;
		this.priceData = priceData;
		this.priceData.registerObserver(this);
	}
	
	public String getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}

	public PriceData getStocks() {
		return priceData;
	}

	public void setPriceData(PriceData stocks) {
		this.priceData = stocks;
	}
	
	public void setStocks(String [] stocks)
	{
		this.stocks = stocks;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.print("Portfolio #" + this.portfolioId + ", ");
		
		int index = 0;

		for(String key : this.stocks)
		{
			String value = String.format("%.2f", Math.floor((this.priceData.getPrices().get(key) * 100.0)) / 100);
			
			if(index == this.stocks.length - 1)
			{
				System.out.println(key + " = " + value);
			}
			else
			{
				System.out.print(key + " = " + value + ", ");
			}
			
			index ++;
		}
	}

	@Override
	public void updateStocks(Map<String, Double> stocks) {
		// TODO Auto-generated method stub
		this.priceData.updatePrices(stocks);
		display();
	}
}
