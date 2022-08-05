package greedyChildren;
/* Ice cream parlours have a name and an amount of ice cream, initially zero.
   They can accept deliveries of ice cream, which increases their stock level.
   They also can serve ice cream to greedy children, which reduces their stock 
   level. Greedy children ask for an amount of ice cream, which they will 
   attempt to eat, unless the parlour`s stock level is less than that amount
   in which case the children are served with as much ice cream as is left.
 */
public class IceCreamParlour {
	
	// The name of the parlour.
	private final String name;
	
	// The amount of ice cream in stock.
	private double iceCreamInStock = 0;
	
	// Construct an ice cream parlour -- given the required name.
	public IceCreamParlour(String requiredName) {
		name = requiredName;
	}
	
	// Accept delivery of ice cream.
	public void acceptDelivery(double amount) {
		iceCreamInStock+=amount;
	}
	
	// Serve ice cream. Attemt to serve the amount desired
	// but as much as we can if stock is too low.
	// Return the amount served.
	public double tryToServe(double desiredAmount) {
		double amountServed = desiredAmount;
		if(amountServed > iceCreamInStock)
			amountServed = iceCreamInStock;
		
		iceCreamInStock-=amountServed;
		return amountServed;
	}
	
	// Return a String giving the name and state.
	public String toString() {
		return name + " has " + iceCreamInStock + " in stock";
	}
}
