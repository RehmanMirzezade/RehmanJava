package lesson6;
	public class Grocery implements Product {
	    private String name;
	    private double price;

	    public Grocery(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public String getName() {
	        return "Grocery: " + name;
	    }
	}


