package lesson6;


	public class Electronics implements Product {
	    private String name;
	    private double price;

	    public Electronics(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public double getPrice() {
	        return price * 1.18;
	    }

	    @Override
	    public String getName() {
	        return "Electronics: " + name;
	    }
	}


