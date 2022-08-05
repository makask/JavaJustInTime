package greedyChildren;
/*
   This program demonstrates th simple model of greedy children eating at ice
   cream parlours. It creates some children and parlours, has deliveries made 
   to the parlours, and children served at them. As this is done, it reports
   on the standard output, enabling the user of the program to follow the 
   events. So the main method tells a story, and can easily be altered to tell 
   a different one.  
 */
public class GreedyChildren {
	
	// The main method tells the 'story'.
	public static void main(String[] args) {
		
		System.out.println("Greedy children:");
		GreedyChild child1 = new GreedyChild("Bloated Basil", 20);
		System.out.println(child1);
		System.out.println("Making child with random capacity less than "
				+ GreedyChild.MAXIMUM_RANDOM_STOMACH_SIZE);
		GreedyChild child2 = new GreedyChild("Cauthious Cathy");
		System.out.println(child2);
		GreedyChild child3 = new GreedyChild("Lanky Larry", 4);
		System.out.println(child3);
		System.out.println();
		
		System.out.println("Ice cream parlours:");
		IceCreamParlour parlour1 = new IceCreamParlour("Glacial Palacial");
		System.out.println(parlour1);
		System.out.println("Ice cream parlours:");
		IceCreamParlour parlour2 = new IceCreamParlour("Nice `n` Iceys");
		System.out.println(parlour2);
		System.out.println("Ice cream parlours:");
		IceCreamParlour parlour3 = new IceCreamParlour("Dreamy Creamy Cup");
		System.out.println(parlour3);
		System.out.println();
		
		System.out.println("Deliveries:");
		System.out.println();
		deliver(parlour1, 50);
		deliver(parlour2, 10);
		deliver(parlour3, 30);
		System.out.println("Eating:");
		System.out.println();
		eat(child1, 15, parlour1);
		eat(child2, 1, parlour1);
		eat(child3, 2, parlour1);
		eat(child1, 8, parlour2);
		eat(child2, 1, parlour2);
		eat(child3, 2, parlour2);
		eat(child1, 10, parlour3);
		eat(child2, 1, parlour3);
		eat(child3, 2, parlour3);
	}
	
	// Private helper method to make a delivery and report it. 
	private static void deliver(IceCreamParlour parlour, double amount) {
		System.out.println(parlour);
		System.out.println("accepts delivery of " + amount);
		parlour.acceptDelivery(amount);
		System.out.println("Result: " + parlour);
		System.out.println();
	}
	
	// Private helper method to have a child eat at a parlour.
	private static void eat(GreedyChild child, double amount, IceCreamParlour parlour) {
		System.out.println(child);
		System.out.println("is entering " + parlour);
		child.enterParlour(parlour);
		System.err.println(child);
		System.out.println("is eating " + amount);
		child.tryToEat(amount);
		System.out.println("Result: " + child);
		System.out.println();
	}

}
