package lesson1;

public class Main2 {
	
	    public static void main(String[] args) {
	        Storage storage1 = new Storage("SSD", 512);  
	        Storage storage2 = new Storage("HDD", 1000); 

	        Computer computer1 = new Computer("Dell XPS", 1500, storage1); 
	        Computer computer2 = new Computer("MacBook Pro", 2500, storage2);

	        
	        
	        System.out.println(computer1); 
	        System.out.println(computer2);  
	        
	     
	    }
	}


