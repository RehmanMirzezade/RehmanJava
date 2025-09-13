package lesson;

public class Student {
	private String name;
	private int yas;
	private double bal;

	public Student(String ad, int yas, double bal) {
		this.name = ad;
		this.yas = yas;
		this.bal = bal;

	}

	public String getname() {
		return this.name;
	}
	public int getage() {
		return this.yas;
		}
	public double getbal() {
		return this.bal;
		
	}
public void setname(String ad) {
	this.name = ad;

	
}
public void setage(int yas) {
	this.yas = yas;
	
}
public void setbal(double bal) {
	this.bal = bal;
}
}

