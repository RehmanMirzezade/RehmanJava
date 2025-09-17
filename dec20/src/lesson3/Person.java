package lesson3;

public class Person {
	
	    int id;
	    String name;
	    String surname;
	    int age;
	    String phone;
	    String address;

	    public Person(int id, String name, String surname, int age, String phone, String address) {
	        this.id = id;
	        this.name = name;
	        this.surname = surname;
	        this.age = age;
	        this.phone = phone;
	        this.address = address;
	    }

	    public void printInfo() {
	        System.out.println("id: " + id);
	        System.out.println("ad" + name);
	        System.out.println("soyad: " + surname);
	        System.out.println("yas: " + age);
	        System.out.println("Telefon: " + phone);
	        System.out.println("unvan: " + address);
	    }
}
