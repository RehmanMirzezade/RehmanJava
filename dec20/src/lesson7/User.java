package lesson7;
import java.time.LocalDateTime;
public class User{
	    private String name;
	    private String surname;
	    private int age;
	    private String address;
	    private LocalDateTime createdDate;

	    public void create(String name, String surname, int age, String address) {
	        this.name = name;
	        this.surname = surname;
	        this.age = age;
	        this.address = address;
	        this.createdDate = LocalDateTime.now();
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Surname: " + surname);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Created Date: " + createdDate);
	        System.out.println("------------------------------");
	    }
	}

 class Main {
	    public static void main(String[] args) {
	        User user1 = new User();
	        user1.create("Ali", "Mammadov", 25, "Baku");

	        User user2 = new User();
	        user2.create("Aysel", "Aliyeva", 30, "Ganja");

	        user1.displayInfo();
	        user2.displayInfo();
	    }
	}


