
public class TestShoppingBasket 
{
	public static void main(String[] args) 
	{
		StockItem[] stockItems = 
		{
			/* 0 */ new MouseMat("Plain blue cloth, foam backed", 150, 10),
			/* 1 */ new MouseMat("Pink vinyl with fluffy trim", 350, 10),
			/* 2 */ new Book("List of all items and prices", 150, 10),
			/* 3 */ new Book("Build a gaming monster", 1799, 0),
			/* 4 */ new CPU(1500, 10),
			/* 5 */ new HardDisc(5500, 10),
			/* 6 */ new Keyboard(200, 10)
		};
		
		System.out.println("Stock before purchase: ");
		for(StockItem stockItem : stockItems)
			System.out.println(stockItem);
		System.out.println();
		
		ShoppingBasket shoppingBasket = new ShoppingBasket();
		shoppingBasket.add(stockItems[0], 4);
		
		System.out.println(shoppingBasket);
	}
}
