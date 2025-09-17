package lesson3;
public class CAt extends Animal{
public CAt(String name,int age) {
	super(name,age);
}
@Override
public void makeNoise() {
	System.out.println(name + "meowwwwwwwwwwwwww");
}
}
