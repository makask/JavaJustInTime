
public class TestStockItemSubclasses {
	
	public static void main(String[] args) {
		
		StockItem[] stockItems = {
				new Book("Catalogue",15, 10),
				new CPU(699, 100),
				new HardDisc(350, 200),
				new Keyboard(29, 50),
				new MouseMat("Green Razor", 59, 200),
				new Book("How To Build A Gaming Rig", 29, 18)
		};
		
		for(StockItem stockItem : stockItems)
			testStockItem(stockItem);
	}// main
	
	private static void testStockItem(StockItem stockItem)
	{
		if(stockItem instanceof TextDescriptionStockItem)
			testTextDescriptionStockItem((TextDescriptionStockItem)stockItem);
		else 
		{
			System.out.println("---------------------------------------------");
			System.out.println(stockItem);
			stockItem.increaseStock(10);
			System.out.println(stockItem);
			stockItem.sellStock(3);
			System.out.println(stockItem);
			stockItem.setPriceExVat(3);
			System.out.println(stockItem);
		}
		
		
		
	}
	
	private static void testTextDescriptionStockItem(TextDescriptionStockItem textDescriptionStockItem)
	{
		for(int count = 1; count <= 2; count++)
		{
			System.out.println("--------------------------------------------------");
			System.out.println(textDescriptionStockItem);
			textDescriptionStockItem.setDescription("Red MouseMat Made In China");
			System.out.println(textDescriptionStockItem);
		}
		
	}
}
