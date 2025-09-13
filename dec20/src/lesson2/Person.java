package lesson2;

public class Person {
int id;
String phone;
String name;
int age;
public Person(int id,String phone,String name, int age) {
	this.id= id;
	this.phone = phone;
	this.age = age;
	this.name = name;
			

}
public void printDetails() {
	System.out.println(id + " "+ phone +age +name);
}
}
