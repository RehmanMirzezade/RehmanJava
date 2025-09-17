package lesson;

public class Car {
	String brand;
    String model;
    int year;
    double price;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;

}
    public void displayInfo() {
        System.out.println(  brand  + model + year +  price);
    }
}

