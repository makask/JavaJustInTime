public class CalendarHighlight {
	
	public static void main(String[] args) {
		
		printMonth(3,31,5);
		
	}
	private static void printMonth(int monthStartDay, int lastDateInMonth, int dateHighlight){
		
		int nextDayColumnToUse = monthStartDay;
		int nextDateToPrint = 1;
		//int keyDateToPrint = dateHighLight;
		
		printMonthLineOfHyphens();
		printColumnHeadings();
		
		int noOfRows = 0;
		
		while(nextDateToPrint <= lastDateInMonth || noOfRows < 6) {
			System.out.print("|");
			for(int dayColumnNumber = 1; dayColumnNumber <= 7; dayColumnNumber++) {
				if(dayColumnNumber>1)
					System.out.print(" ");
				
				if(dayColumnNumber!=nextDayColumnToUse || nextDateToPrint > lastDateInMonth)
					printDateSpace();
				else {
					if(dateHighlight == nextDateToPrint)
						printKeyDate(nextDateToPrint);
					else
						printDate(nextDateToPrint);
						nextDayColumnToUse++;
						nextDateToPrint++;
					}// else
			}// for
			System.out.println("|");
			noOfRows++;
			nextDayColumnToUse = 1;
		}
		
		
		printMonthLineOfHyphens();
	}
	private static void printMonthLineOfHyphens(){
		System.out.print(" ");
		for (int dayColumnNumber = 1; dayColumnNumber <= 7; dayColumnNumber++) {
			if(dayColumnNumber > 1)
				System.out.print("--");
				printDateHyphens();
		}
		System.out.println("- ");
		
	}
	private static void printDateHyphens(){
		System.out.print("---");
		
	}
	private static void printColumnHeadings(){
		System.out.print("| ");
		for (int dayColumnNumber = 1; dayColumnNumber <= 7; dayColumnNumber++) {
			if(dayColumnNumber > 1)
			System.out.print("   ");	
			printColumnHeading(dayColumnNumber);
		}
		System.out.println(" |");
	}
	private static void printColumnHeading(int dayNo){
		switch(dayNo){
		case 1: System.out.print("Su"); break;
		case 2: System.out.print("Mo"); break;
		case 3: System.out.print("Tu"); break;
		case 4: System.out.print("We"); break;
		case 5: System.out.print("Th"); break;
		case 6: System.out.print("Fr"); break;
		case 7: System.out.print("Sa"); break;
		}
		
	}
	private static void printDateSpace(){
		System.out.print("    ");
	}
	private static void printDate(int nextDateToPrint){
		System.out.print(" ");
		System.out.printf("%02d", nextDateToPrint);
		System.out.print(" ");
	}
	
	private static void printKeyDate(int dayHighLighted){
		System.out.print(">");
		System.out.printf("%02d",dayHighLighted);
		System.out.print("<");
	}
	
	
}