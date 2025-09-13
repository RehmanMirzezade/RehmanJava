package lesson2;

public class Studentt {
	String name;
	int age;
	int classnumber;

	public Studentt(String name, int age, int classnumber) {
		this.name = name;
		this.age = age;
		this.classnumber = classnumber;
	}

	public void displayInfo() {
		System.out.println("Menim adim:" + name);
		System.out.println("Menim yasim:" + age);
		System.out.println("Menim sinif nomrem:" + classnumber);
	}
}
