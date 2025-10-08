package lesson5;

public class Menfieded {

	    public static void checkNumber(int number) {
	        if (number < 0) {
	            throw new IllegalArgumentException("menfi ola bilmez");
	        } else {
	            System.out.println("eded duzgundur " + number);
	        }
	    }
	    public static void main(String[] args) {
	        try {
	            checkNumber(-5); 
	        } catch (IllegalArgumentException e) {
	            System.out.println("xeta: " + e.getMessage());
	        }

	        try {
	            checkNumber(10); 
	        } catch (IllegalArgumentException e) {
	            System.out.println("xeta: " + e.getMessage());
	        }
	    }
	

}
