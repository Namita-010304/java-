import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.time.temporal.WeekFields;

public class main1 {
public static void main(String[] args) {
// Creating a LocalDate object
LocalDate date = LocalDate.of(2007, 1, 3);

// Accessing individual date fields
int year = date.getYear();
int month = date.getMonthValue();
int day = date.getDayOfMonth();
int dayOfYear = date.getDayOfYear();
int dayOfWeek = date.getDayOfWeek().getValue(); // 1 for Monday, 2 for Tuesday, ..., 7 for Sunday
int weekOfYear = date.get(WeekFields.ISO.weekOfWeekBasedYear());

// Printing the date and its fields
System.out.println("Date: " + date);
System.out.println("Year: " + year);
System.out.println("Month: " + month);
System.out.println("Day: " + day);
System.out.println("Day of Year: " + dayOfYear);
System.out.println("Day of Week: " + dayOfWeek);
System.out.println("Week of Year: " + weekOfYear);
System.out.println("Is leap Year: "+date.isLeapYear());


LocalDate newDate = date.withYear(2024);
System.out.println(newDate);

LocalDate newDate1 = date.withMonth(12);
System.out.println(newDate1);

LocalDate newDate2 = date.withDayOfMonth(25);
System.out.println(newDate2);

LocalDate newDate3 = date.withDayOfYear(90);
System.out.println(newDate3);

// plusYears()
LocalDate plusYearsDate = date.plusYears(2);
System.out.println("Date after adding 2 years: " + plusYearsDate);

// plusMonths()
LocalDate plusMonthsDate = date.plusMonths(6);
System.out.println("Date after adding 6 months: " + plusMonthsDate);

// plusWeeks()
LocalDate plusWeeksDate = date.plusWeeks(2);
System.out.println("Date after adding 2 weeks: " + plusWeeksDate);

// plusDays()
LocalDate plusDaysDate = date.plusDays(10);
System.out.println("Date after adding 10 days: " + plusDaysDate);

// minusYears()
LocalDate minusYearsDate = date.minusYears(1);
System.out.println("Date after subtracting 1 year: " + minusYearsDate);

// minusMonths()
LocalDate minusMonthsDate = date.minusMonths(3);
System.out.println("Date after subtracting 3 months: " + minusMonthsDate);

// minusWeeks()
LocalDate minusWeeksDate = date.minusWeeks(1);
System.out.println("Date after subtracting 1 week: " + minusWeeksDate);

// minusDays()
LocalDate minusDaysDate = date.minusDays(15);
System.out.println("Date after subtracting 15 days: " + minusDaysDate);





// create Date
// Create a LocalTime object
LocalTime time = LocalTime.of(14, 30, 15, 500000000);
System.out.println("Time: " + time);

// getHour()
int hour = time.getHour();
System.out.println("Hour: " + hour);

// getMinute()
int minute = time.getMinute();
System.out.println("Minute: " + minute);

// getSecond()
int second = time.getSecond();
System.out.println("Second: " + second);

// getNano()
int nano = time.getNano();
System.out.println("Nanosecond: " + nano);

// isAfter(LocalTime l)
LocalTime anotherTime1 = LocalTime.of(12, 0);
System.out.println("Is " + time + " after " + anotherTime1 + "? " + time.isAfter(anotherTime1));

// isBefore(LocalTime l)
LocalTime anotherTime2 = LocalTime.of(16, 0);
System.out.println("Is " + time + " before " + anotherTime2 + "? " + time.isBefore(anotherTime2));

// atDate(LocalDate d)
LocalDate date1 = LocalDate.of(2022, 3, 18);
LocalDateTime dateTime = time.atDate(date1);
System.out.println("DateTime: " + dateTime);




//set hour min sec nano

// withHour(int hour)
LocalTime newTime1 = time.withHour(10);
System.out.println("Time with hour set to 10: " + newTime1);

// withMinute(int min)
LocalTime newTime2 = time.withMinute(45);
System.out.println("Time with minute set to 45: " + newTime2);

// withSecond(int sec)
LocalTime newTime3 = time.withSecond(20);
System.out.println("Time with second set to 20: " + newTime3);

// withNano(int ns)
LocalTime newTime4 = time.withNano(999999999);
System.out.println("Time with nanosecond set to 999999999: " + newTime4);


//add and sub hour min sec and nano

// plusHours(long hours)
LocalTime newTime5 = time.plusHours(2);
System.out.println("Time plus 2 hours: " + newTime5);

// plusMinutes(long min)
LocalTime newTime6 = time.plusMinutes(15);
System.out.println("Time plus 15 minutes: " + newTime6);

// plusSeconds(long sec)
LocalTime newTime7 = time.plusSeconds(30);
System.out.println("Time plus 30 seconds: " + newTime7);

// plusNanos(long ns)
LocalTime newTime8 = time.plusNanos(1000000000);
System.out.println("Time plus 1 second (in nanoseconds): " + newTime8);

// minusHours(long hours)
LocalTime newTime9 = time.minusHours(1);
System.out.println("Time minus 1 hour: " + newTime9);

// minusMinutes(long min)
LocalTime newTime10 = time.minusMinutes(10);
System.out.println("Time minus 10 minutes: " + newTime10);

// minusSeconds(long sec)
LocalTime newTime11 = time.minusSeconds(5);
System.out.println("Time minus 5 seconds: " + newTime11);




// Get hour, minute, and second
int hour1 = time.getHour();
int minute1 = time.getMinute();
int second1 = time.getSecond();

System.out.println("Hour: " + hour1);
System.out.println("Minute: " + minute1);
System.out.println("Second: " + second1);

// Get year, month, and day
int year1 = date.getYear();
int month1 = date.getMonthValue();
int day1 = date.getDayOfMonth();

System.out.println("Year: " + year1);
System.out.println("Month: " + month1);
System.out.println("Day: " + day1);

// plusHours(long hours)
LocalDateTime dateTime1 = time.atDate(date1).plusHours(2);
System.out.println("DateTime after adding 2 hours: " + dateTime1);

// plusMinutes(long min)
LocalDateTime dateTime2 = time.atDate(date1).plusMinutes(30);
System.out.println("DateTime after adding 30 minutes: " + dateTime2);

// minusHours(long hours)
LocalDateTime dateTime3 = time.atDate(date1).minusHours(1);
System.out.println("DateTime after subtracting 1 hour: " + dateTime3);

// Create a LocalDateTime object
LocalDateTime dateTimee = LocalDateTime.of(2022, 3, 18, 14, 30, 15);
System.out.println("DateTime: " + dateTimee);

// Convert to LocalDate
LocalDate datee = dateTimee.toLocalDate();
System.out.println("LocalDate: " + datee);

// Convert to LocalTime
LocalTime timee = dateTimee.toLocalTime();
System.out.println("LocalTime: " + timee);

// withYear(int y)
LocalDateTime dateTimeWithYear = dateTimee.withYear(2023);
System.out.println("DateTime with year 2023: " + dateTimeWithYear);

// withHour(int hr)
LocalDateTime dateTimeWithHour = dateTimee.withHour(16);
System.out.println("DateTime with hour 16: " + dateTimeWithHour);



}
}