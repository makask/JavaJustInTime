
public class Keyboard extends StockItem
{
	public Keyboard(int initialPriceExVat, int initialQuantityInStock)
	{
		super(initialPriceExVat, initialQuantityInStock);
	}
	
	public String getStockType()
	{
		return "Keyboard";
	}
	
	public String getDescription()
	{
		return "Cream, non-click";
	}
}
