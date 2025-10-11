package lesson6;

	public class Clothing implements Product {
	    private String name;
	    private double price;

	    public Clothing(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    @Override
	    public double getPrice() {
	        return price * 0.90;
	    }

	    @Override
	    public String getName() {
	        return "Clothing item: " + name;
	    }
	}


