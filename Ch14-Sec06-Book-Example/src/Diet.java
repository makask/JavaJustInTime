import java.io.File;
import java.util.Scanner;

/* This program reads food information from food-details.txt
 * and diet information from diet-diary.txt
 * and produces a table of how much nutritional component was eaten.
 */
public class Diet {
	
	// The FoodList to be obtained from food-details.txt.
	private static FoodList foodList;
	
	//E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec06-Book-Example/src/food-details.txt
	
	// The main method.
	public static void main(String[] args) throws Exception {
		foodList = new FoodList(new Scanner(new File("E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec06-Book-Example/src/food-details.txt")));
		readDietDiary(new Scanner(new File("E:/EclipseWorkspace/JavaJustInTime2021/Ch14-Sec06-Book-Example/src/diet-diary.txt")));
		printDietTable();
	}// main
	
	// An array of total nutritional component amounts:
	// Index is [component number]
	// and data is accumulated as number of milligrams of that component.
	private static int[] dietTable = new int[Food.NUTRITIONAL_COMPONENTS.length];
	
	// Read the diet information from the given Scanner
	// accumulating nutritional components in dietTable.
	private static void readDietDiary(Scanner scanner) {
		// First initialize the amounts to zero.
		for(int componentIndex = 0; componentIndex < Food.NUTRITIONAL_COMPONENTS.length; componentIndex++)
			dietTable[componentIndex] = 0;
		// Now read each line:
		while(scanner.hasNextLine()) {
			String[] portionDetails = scanner.nextLine().split("\t+");
			// Food name is the first item.
			Food food = foodList.findFood(portionDetails[0]);  // pizza, garlic bread, cheesecake, burger, fries, milkshake, fried chicken, wedges
			if(food == null)
				System.out.println("Unrecognized food name: " + portionDetails[0]);
			else {
				// Food amount is the second item.
				int amount = Integer.parseInt(portionDetails[1]);
				// Obtain nutritional components from that amount.
				int [] foodComponents = food.componentMilliGramsForWeight(amount);
				// And accumulate them in dietTable.
				for(int componentIndex = 0; componentIndex < Food.NUTRITIONAL_COMPONENTS.length; componentIndex++)
					dietTable[componentIndex] += foodComponents[componentIndex];
			}// else
		}// while
	}// readDietDiary
	
	// Print the dietTable as grams (so divide by 1000).
	private static void printDietTable() {
		for(int componentIndex = 0; componentIndex < Food.NUTRITIONAL_COMPONENTS.length; componentIndex++)
			System.out.println(Food.NUTRITIONAL_COMPONENTS[componentIndex] + "\t"
					+ Math.round(dietTable[componentIndex] / 1000));
	}// printDietTable

}// class Diet

