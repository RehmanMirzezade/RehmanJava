package lesson6;

public class Main {
	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart();

	        Product phone = new Electronics("Smartphone", 1000);
	        Product tshirt = new Clothing("T-shirt", 50);
	        Product milk = new Grocery("Milk", 3);

	        cart.addProduct(phone);
	        cart.addProduct(tshirt);
	        cart.addProduct(milk);

	        cart.printCart();
	    }
	}


