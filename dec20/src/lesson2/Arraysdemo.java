package lesson2;

public class Arraysdemo {
public static void main(String[] args) {
	int[] numbers = new int[4];
	numbers[0]=9;
	numbers[1]=99;
	numbers[2]=999;
	numbers[3]=9999;
	numbers[4]=99999;

for(int eded:numbers) {
	System.out.println(eded);
}
int test = 0;
for(int number:numbers) {
	number+=test;
}
int minimum=numbers[0];
for(int i = 1;i<numbers.length;i++) {
	if(numbers[i]<minimum) {
		minimum=numbers[i];
		System.out.println(i);
	}
}
for(int o = 0;o<numbers.length;o++) {
	if(numbers[o]%2!=0) {
		System.out.println(o);
	}
}
}
}
