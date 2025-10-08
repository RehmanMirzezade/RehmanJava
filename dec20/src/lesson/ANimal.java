package lesson;

public class ANimal {
	private String name;
	private int age;

	public ANimal(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return this.name;
	}

	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}

class Mainnnnn{
	public static void main(String[] args) {
		ANimal animal = new ANimal("It",2);
		animal.printInfo();


	}

}
