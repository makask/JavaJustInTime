// Representation of a date.
public class Date {
	
	// Class variable to hold the present date.
	private static Date presentDate = null;
	
	// Instance variables: the day, month and year of a date.
	private final int day, month, year;
	
	public Date(int requiredDay, int requiredMonth, int requiredYear) {
		day = requiredDay;
		month = requiredMonth;
		year = requiredYear;
	}
	
	// Class method to set the present date.
	// This does nothing if it has already been set.
	public static void setPresentDate(Date requiredPresentDate) {
		if(presentDate == null)
			presentDate = requiredPresentDate;
	}
	
	// Class method to obtain the present date.
	public static Date getPresentDate() {
		return presentDate;
	}
	
	// Compare this date with a given other one, for equality.
	public boolean equals(Date other) {
		return day == other.day && month == other.month && year == other.year;
	}
	
	// Compare this date with a given other one , for less than.
	public boolean lessThan(Date other) {
		return year < other.year 
				|| year == other.year 
					&& (month < other.month 
							|| month == other.month && day < other.day);
	}
	
	// Return the day/month/year representation of the date.
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
	// Return a new Date which is one year later than this one.
	public Date addYear() {
		return new Date(day, month, year + 1);
	}
}
