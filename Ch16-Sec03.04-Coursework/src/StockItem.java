
public abstract class StockItem 
{
	// The number of stock items created so far.
	private static int noOfStockItemsCreated = 0;
	
	// The fixed stock code of this item.
	private final int stockCode;
	
	private int initialPriceExVat;
	private int initialQuantityInStock;
	
	
	public StockItem(int initialPriceExVat, int initialQuantityInStock) 
	{
		this.initialPriceExVat = initialPriceExVat;
		this.initialQuantityInStock = initialQuantityInStock;
		noOfStockItemsCreated++;
		stockCode = noOfStockItemsCreated;
	}//StockItem
	
	public int getStockCode()
	{
		return stockCode;
	}// getStockCode
	
	public abstract String getStockType();
	
	public abstract String getDescription();
	
	public int getQuantityInStock()
	{
		return initialQuantityInStock;
	}// getQuantityInStock
	
	public void increaseStock(int amount)
	{
		if(amount < 1)
			throw new IllegalArgumentException("Amount cannot be less than 1");
		else
			initialQuantityInStock+=amount;
	}// increaseStock
	
	public boolean sellStock(int amount)
	{
		if(amount < 1) {
			throw new IllegalArgumentException("Amount cannot be less than 1");
		} 
		else if(amount<=initialQuantityInStock) {
			initialQuantityInStock-=amount;
			return true;
		}else {
			return false;
		}
			
	}// sellStock
	
	public void setPriceExVat(int price)
	{
		initialPriceExVat = price;
	}// setPriceExVat
	
	public int getPriceExVat()
	{
		return initialPriceExVat;
	}// getPriceExVat
	
	
	public double getVatRate()
	{
		return 17.5;
	}// getVatRate
	
	public int getPriceIncVat()
	{
		return (int) Math.round((initialPriceExVat + (initialPriceExVat * getVatRate() / 100)));
	}// getPriceIncVat
	
	public String toString()
	{
		return getStockType() + ", " + getDescription() + " (" + initialQuantityInStock + " @ " + getPriceExVat() + "p/" + getPriceIncVat() + "p)";
	}
}// class StockItem
