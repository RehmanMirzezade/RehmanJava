package lesson6;


	import java.util.ArrayList;
	import java.util.List;

	public class ShoppingCart {
	    private List<Product> items;

	    public ShoppingCart() {
	        items = new ArrayList<>();
	    }

	    public void addProduct(Product product) {
	        items.add(product);
	    }

	    public double calculateTotal() {
	        double total = 0.0;
	        for (Product p : items) {
	            total += p.getPrice();
	        }
	        return total;
	    }

	    public void printCart() {
	        for (Product p : items) {
	            System.out.println(p.getName() + " - Price: " + p.getPrice());
	        }
	        System.out.println("Total: " + calculateTotal());
	    }
	}


