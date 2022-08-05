
public class CPU extends StockItem
{
	public CPU(int initialPriceExVat, int initialQuantityInStock)
	{
		super(initialPriceExVat, initialQuantityInStock);
	}
	
	public String getStockType()
	{
		return "CPU";
	}
	
	public String getDescription()
	{
		return "Really fast";
	}
}
