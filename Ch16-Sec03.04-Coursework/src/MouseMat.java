
public class MouseMat extends TextDescriptionStockItem {
	
	public MouseMat(String description, int initialPriceExVat, int initialQuantityInStock)
	{
		super(description,initialPriceExVat,initialQuantityInStock);
	}// MouseMat
	
	public String getStockType()
	{
		return "Mouse mat";
	}// getStockType
	
}// class MouseMat
