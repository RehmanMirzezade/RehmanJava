package lesson5;

public class Calculator {
	    public void calculatePrice(Object obj) {
	        if (obj instanceof Car) {
	            Car car = (Car) obj;

	            if (car.year >= 2020) {
	                car.price = 35000;
	            } else if (car.year >= 2010) {
	                car.price = 25000;
	            } else {
	                car.price = 15000;
	            }

	            System.out.println("Model: " + car.model + ", İl: " + car.year + ", Qiymət: " + car.price);
	        } else {
	            System.out.println("cara aid deyil");
	        }
	    }
	}


