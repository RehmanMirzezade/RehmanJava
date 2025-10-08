package lesson5;

public class Multicatch {
	    public static void main(String[] args) {
	        int a = 10, b = 0;
	        String str = "Salam";

	        try {
	            int result = a / b;
	            char ch = str.charAt(10); 
	            System.out.println("netice: " + result + ", simvol: " + ch);
	        } catch (ArithmeticException | StringIndexOutOfBoundsException e) {
	            System.out.println("Xeta bas verdi: " + e.getMessage());
	        }
	    }
	}


