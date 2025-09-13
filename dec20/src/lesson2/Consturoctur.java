package lesson2;

public class Consturoctur {
Integer id;
String phone;
String name;
String surname;
String adress;
int salary;
public Consturoctur() {
	
}
public Consturoctur(Integer id,String phone,String name,String surname,String adress,int salary) {
	this.id = id;
	this.phone = phone;
	this.name = name;
	this.surname = surname;
	this.adress = adress;
	this.salary = salary;
	public printInfo() {
		System.out.printlnfo(id + phone + name + surname + adress + salary);
	}
}

}
