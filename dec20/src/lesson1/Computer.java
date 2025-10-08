package lesson1;

public class Computer {
	
	    private String name;   
	    private Integer price;    
	    private Storage storage;  

	    public Computer(String name, Integer price, Storage storage) {
	        this.name = name;
	        this.price = price;
	        this.storage = storage;
	    }
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public Integer getPrice() {
	        return price;
	    }

	    public void setPrice(Integer price) {
	        this.price = price;
	    }

	    public Storage getStorage() {
	        return storage;
	    }

	    public void setStorage(Storage storage) {
	        this.storage = storage;
	    }

	    @Override
	    public String toString() {
	        return "Computer: " + name + "price" + price + ", Storage: " + storage;
	    }
	}


