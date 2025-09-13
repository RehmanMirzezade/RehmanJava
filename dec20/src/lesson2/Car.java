package lesson2;

public class Car {
String brand;
int year;
public Car() {
	this.brand = "mercedes";
	this.year = 2000;
	
	
}
public Car(String brand,int year) {
	this.brand = brand;
	this.year = year;
	
}
public void printInfo() {
	System.out.println(year);
	System.out.println(brand);
}
}
