package lesson7;

public class Bird {
	    String color;
	    int wings;

	    public Bird(String color, int wings) {
	        this.color = color;
	        this.wings = wings;
	    }
	}

	class Parrot extends Bird {
	    String name;
	    boolean canTalk;

	    public Parrot(String color, int wings, String name, boolean canTalk) {
	        super(color, wings);
	        this.name = name;
	        this.canTalk = canTalk;
	    }

	    @Override
	    public String toString() {
	        return "Parrot{" +
	                "color='" + color + '\'' +
	                ", wings=" + wings +
	                ", name='" + name + '\'' +
	                ", canTalk=" + canTalk +
	                '}';
	    }
	}



