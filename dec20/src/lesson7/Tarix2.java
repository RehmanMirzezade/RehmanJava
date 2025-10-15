package lesson7;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Date;
public class Tarix2 {


	
	    public static void main(String[] args) {
	        LocalDate date1 = LocalDate.of(2025, 10, 11);
	        LocalDate date2 = LocalDate.of(2025, 12, 1);
	        if (date1.isBefore(date2)) {
	            System.out.println("Birinci tarix daha erkəndir: " + date1);
	        } else if (date1.isAfter(date2)) {
	            System.out.println("İkinci tarix daha erkəndir: " + date2);
	        } else {
	            System.out.println("Hər iki tarix eynidir.");
	        }

	        LocalDate today = LocalDate.now();
	        LocalDate nextSunday = today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
	        System.out.println("Növbəti bazar günü: " + nextSunday);

	        long daysBetween = ChronoUnit.DAYS.between(date1, date2);
	        System.out.println("Tarixlər arasındakı gün fərqi: " + daysBetween);

	        Date oldDate = new Date();
	        LocalDateTime localDateTime = oldDate.toInstant()
	                                             .atZone(ZoneId.systemDefault())
	                                             .toLocalDateTime();
	        System.out.println("Çevrilmiş LocalDateTime: " + localDateTime);

	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        String formattedDateTime = localDateTime.format(formatter);
	        System.out.println("Formatlanmış LocalDateTime: " + formattedDateTime);

	        String datetimeString = "2025-10-11 15:45:30";
	        LocalDateTime parsedDateTime = LocalDateTime.parse(datetimeString, formatter);
	        System.out.println("Pars olunmuş LocalDateTime: " + parsedDateTime);

	        LocalTime startTime = LocalTime.of(14, 0);
	        LocalTime endTime = LocalTime.of(16, 45);  
	        Duration duration = Duration.between(startTime, endTime);
	        long minutes = duration.toMinutes();
	        System.out.println("Görüş vaxtı: " + startTime + " - " + endTime);
	        System.out.println("Görüş müddəti (dəqiqə ilə): " + minutes);

	        int yearToCheck = 2024;
	        LocalDate leapDate = LocalDate.of(yearToCheck, 1, 1);
	        boolean isLeap = leapDate.isLeapYear();
	        System.out.println(yearToCheck + " ili leap year-dırmı? " + isLeap);
	    }
	}


