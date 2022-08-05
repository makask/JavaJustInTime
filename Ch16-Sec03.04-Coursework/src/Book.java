public class Book extends TextDescriptionStockItem
{
	public Book(String description, int initialPriceExVat, int initialQuantityInStock)
	{
		super(description,initialPriceExVat,initialQuantityInStock);
	}

	public String getStockType() {
		return "Book";
	}
	
	public double getVatRate()
	{
		return 0;
	}// getVatRate
}
