package sept6;
import java.time.*;
import java.time.temporal.*;
public class DateTimeExample {

	public static void main(String[] args) {
		
		
		LocalDateTime local =  LocalDateTime.now();
		System.out.println("Local "+local);
		
		LocalDate date = LocalDate.now();
		System.out.println("Date "+ date);
		
		Month month = local.getMonth();
		System.out.println("Month " + month);
		
		LocalDateTime date1 = local.withDayOfMonth(30).withYear(2022);
		System.out.println(date1);
		
		ZonedDateTime zoned = ZonedDateTime.now();
		System.out.println(zoned);
		
		ZoneId zoneId = zoned.getZone();
		System.out.println("Zoned Id " + zoneId);
		
		LocalDate today = LocalDate.now();
		LocalDate nextDay = today.plus(1, ChronoUnit.DAYS);
		System.out.println("Today"+ today);
		System.out.println("Next day"+ nextDay);
		
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("Next week "+nextWeek);
		
		LocalDate nextMonth = today.plus(10, ChronoUnit.MONTHS);
		//nextMonth=today.plusMonths(10);
		System.out.println("Next Month "+nextMonth);
		
		LocalDate nextYear = today.plus(4, ChronoUnit.YEARS);
		System.out.println("Next Year "+nextYear);
		
		Period diff = Period.between(date, nextYear);
		System.out.println(" Diff "+ diff.get(ChronoUnit.YEARS));
		
		
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = time1.plus(1,ChronoUnit.HOURS);
		Duration dur = Duration.between(time1,time2);
		System.out.println("Duration "+ dur.getSeconds());
		
		
		LocalDateTime nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
	     System.out.println("Next Tuesday on : " + nextTuesday);
		// TODO Auto-generated method stub

	}

}
