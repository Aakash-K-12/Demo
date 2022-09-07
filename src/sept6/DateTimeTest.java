package sept6;
import java.time.*;
import java.util.*;
import java.time.temporal.*;
public class DateTimeTest {
	public static void main(String [] args) {
	LocalDate local = LocalDate.now();
	//Scanner sc = new Scanner(System.in);
	
	// How to find the   today's date in Java 8 
	System.out.println("Todays date "+local);
	
	
	//2
	System.out.println("day is "+ local.getDayOfWeek());
	System.out.println("Month is "+local.getMonth());
	System.out.println("Year is "+local.getYear());
	
	//3
	LocalDate local1 = LocalDate.of(2022, 7,06);
	System.out.println("Particular date "+local1);
	
	//4
	if(local.equals(local1)) {
		System.out.println("Dates are equal");
	}
	else {
		System.out.println("Dates are not equal");
	}
	
	//5
	LocalDate birthDate = LocalDate.of(2000, 04, 12);
	
	Month month = birthDate.getMonth();
	
	int day= birthDate.getDayOfMonth();
	
	if(local.getDayOfMonth()==day  &&  local.getMonth()==month) {
		System.out.println("Today is your birth day");
	}
	else {
		System.out.println("Today is not your birth day");
	}
	
	//6
	if(local.isLeapYear()) {
		System.out.println(" Leap Year");
	}else {
		System.out.println(" Not a leap a year");
	}
	//7
	LocalTime time = LocalTime.now();
	System.out.println("Curent time "+time);
	
	//  Add hours to the time 
	
	LocalTime timeAdd= time.plus(1,ChronoUnit.HOURS);
	System.out.println(" time after adding hours "+timeAdd);
	
	
	// Find the date before  and after one year
	System.out.println(" Current Date "+	local);

	System.out.println(" Before 1 year "+	local.minus(1, ChronoUnit.YEARS));
	System.out.println("After 1 year  "+	local.plus(1, ChronoUnit.YEARS));

	}
}

