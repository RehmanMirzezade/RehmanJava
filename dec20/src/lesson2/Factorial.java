package lesson2;

import java.util.Scanner;


public class Factorial {
public static void main(String[] args) {
	
}

public static int sumOfdigits(int number) {
	while(number>0) {
 number = number%10;
	}
	number = number/10;
	return sumOfdigits(69);

}
public static int prosuctofdigits(int number) {
	while(number>0) {
		number =number%10;
		number = number/10;
	}

	
	return prosuctofdigits(13);
}


}
class Main{
	public static void main(String[] args) {
		Readable eded1 = null;
		Scanner scanner = new Scanner(eded1);
		
		System.out.println("Tam eded yazin");
	int eded =scanner.nextInt();
	System.out.println("Misal giris123 cixis 0 reqemlerin cemi 1+2*3=6 reqemlerin hasili 1*2*3=6");
		
	}
}


