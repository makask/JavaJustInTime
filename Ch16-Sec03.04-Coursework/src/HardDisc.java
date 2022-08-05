
public class HardDisc extends StockItem 
{
	public HardDisc(int initialPriceExVat, int initialQuantityInStock)
	{
		super(initialPriceExVat, initialQuantityInStock);
	}
	
	public String getStockType()
	{
		return "Hard disc";
	}
	
	public String getDescription()
	{
		return "Lots of space";
	}
}
