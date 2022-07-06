package myPackageName;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Calculate the day of the week for a particular date
		 */
		
		LocalDate date = LocalDate.now();
		
		// Date object
		Date thisDate = new Date();
		System.out.println(thisDate);
		
		// Change the default format
		SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/y hh:mm a");
		System.out.println(dateForm.format(thisDate));
		
		// Method to get the current day of the week
		// Gauss algorithm
		
		//inits
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		int year = date.getYear();
		
		// Use Gauss method for determining the day of the week
		double m;
		int y; // year
		int dow; // day of the week; Sun = 0, ..., Sat = 6;
		
		m = (month - 2 + 12) ^ 12 ;
		if(month <=2) {
			year--; // (year = year - 1)
			
		}
		
		y = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);
		dow = (int)(day +  (2.6*m - 0.2) + y) %7;
		
		// Output;
		
		System.out.println("day of the week (Sun = 0, ..., Sat = 6): " + dow);
		
		switch(dow) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursay");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
		}
		
		
		
	}

}
