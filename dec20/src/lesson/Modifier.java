package lesson;

public class Modifier {
private String name;
public Modifier(String secondname) {
	this.name = secondname;
}
public String getName() {
return this.name;

}

public void setName(String ad) {
	this.name = ad;
	
}
class Main{
public static void main(String[] args) {
	Modifier modifier = new Modifier("Rahman");
	System.out.println(modifier.getName());
	modifier.setName("Rehman");
	System.out.println(modifier);
}	
	
}
}
