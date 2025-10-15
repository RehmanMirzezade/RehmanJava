package lesson7;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Tarixler {



	    public static void main(String[] args) {
	        LocalDate date = LocalDate.now();
	        int year = date.getYear();
	        int month = date.getMonthValue();
	        int day = date.getDayOfMonth();
	        System.out.println("İl: " + year + ", Ay: " + month + ", Gün: " + day);

	        LocalTime time = LocalTime.now();
	        System.out.println("Cari vaxt: " + time);

	        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	        String formattedTime = time.format(timeFormatter);
	        System.out.println("Formatlanmış vaxt: " + formattedTime);

	        LocalDateTime dateTime = LocalDateTime.now();
	        System.out.println("Cari tarix və vaxt: " + dateTime);

	        String dateString = "2025-10-11";
	        LocalDate parsedDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        System.out.println("Pars olunmuş tarix: " + parsedDate);

	        String timeString = "14:30:45";
	        LocalTime parsedTime = LocalTime.parse(timeString, DateTimeFormatter.ofPattern("HH:mm:ss"));
	        System.out.println("Pars olunmuş vaxt: " + parsedTime);

	        LocalDate futureDate = date.plusDays(5);
	        System.out.println("5 gün sonrakı tarix: " + futureDate);

	        LocalTime pastTime = time.minusHours(3);
	        System.out.println("3 saat əvvəlki vaxt: " + pastTime);
	    }
	}


