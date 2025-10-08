package lesson5;

public class DivisionExample {
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 0;

	        try {
	            int result = a / b;
	            System.out.println("netice: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("error:bolmek olmur");
	        } finally {
	            System.out.println("emeliyyat bitti");
	        }
	    }
	}


