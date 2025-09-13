package lesson2;
import lesson2.Person;
public class Classandobject {
	public static void main(String args){
		Person person = new Person(80,"nokia","Murad",19);
		Person person2 = new Person(90,"samsungS25ultra","Rafiq",20);
        person.printDetails();
        person2.printDetails();
	}
}
