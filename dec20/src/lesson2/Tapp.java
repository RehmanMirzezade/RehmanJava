package lesson2;

public class Tapp {
String name;
int age;
double grade;
public Tapp(String name,int age,double grade) {
	this.name = name;
	this.age = age;
	this.grade = grade;
}
public void printInfo() {
	System.out.println(name + age + grade);
}

}
