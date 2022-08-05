import java.util.Scanner;

// Keeps a list of food items, and provides a search facility.
public class FoodList {
	
	// For array extension of foodList.
	private static final int INITIAL_ARRAY_SIZE = 100, ARRAY_RESIZE_FACTOR = 2;
	
	// The food details are stored in a partially filled array
	// with an associated count.
	private int noOfFoodItems;
	private Food[] foodList;
	
	// The constructor reads the food details from the given scanner
	// and stores them in foodList, extending as necessary.
	public FoodList(Scanner scanner) {
		foodList = new Food[INITIAL_ARRAY_SIZE];
		// The first line is just titles.
		scanner.nextLine();
		noOfFoodItems = 0;
		while(scanner.hasNextLine()) {
			// Food constructor parses the whole line.
			Food latestFood = new Food(scanner.nextLine());
			// Extend the array if it is full.
			if(noOfFoodItems == foodList.length) {
				Food[]biggerArray = new Food[foodList.length * ARRAY_RESIZE_FACTOR];
				for(int index = 0; index < foodList.length; index++)
					biggerArray[index] = foodList[index];
				foodList = biggerArray;
			}// if
			// Store the new item and count it.
			foodList[noOfFoodItems] = latestFood;
			noOfFoodItems++;
		}// while
	}// FoodList
	
	// Find the Food object corresponding to foodName
	// or return null if not found.
	public Food findFood(String foodName) {
		int foodIndex = 0;
		while(foodIndex < noOfFoodItems
				&& ! foodList[foodIndex].getName().equals(foodName))
			foodIndex++;
		if(foodIndex == noOfFoodItems)	return null;
		else 							return foodList[foodIndex];
	}// findFood

}// class FoodList
