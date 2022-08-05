
public abstract class TextDescriptionStockItem extends StockItem
{
	private String description;
	
	public TextDescriptionStockItem(String requiredDescription, int initialPriceExVat, int initialQuantityInStock)
	{
		super(initialPriceExVat, initialQuantityInStock);
		description = requiredDescription;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String requiredDescription)
	{
		description = requiredDescription;
	}
	
}
