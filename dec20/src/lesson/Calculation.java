package lesson;

public class Calculation {


	    public int toplama(int a, int b) {
	        return a + b;
	    }

	    public int cixma(int a, int b) {
	        return a - b;
	    }

	    public int vurma(int a, int b) {
	        return a * b;
	    }

	    public double bolme(int a, int b) {
	        if (b == 0) {
	        	System.out.println("bolunmur");
	            return 0;
	        }
	        return (double) a / b;
	    }

	    public int qaliqTapma(int a, int b) {
	        if (b == 0) {
	        	System.out.println("qaliq olmur");
	            return 0;
	        }
	        return a % b;
	    }
	}


