package lesson6;

public class User {
private int age;
public void setAge(int age) throws Ageexecpiton{
if(age<14) {
	throw new Ageexecpiton("Yas 14den az ola bilmez !!!!!!!");
}
this.age = age;
}
public int getAge() {
	return age;
}
}
