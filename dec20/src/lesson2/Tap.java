package lesson2;

public class Tap {
public static void main(String[] args) {
	int[][] massiv = {
			{2,3,5,1},
			{9,21,435,76}
	};
//	System.out.println(massiv[0][0]);
//	System.out.println(massiv[1][1]);
//	System.out.println(massiv[2][2]);
//	System.out.println(massiv[3][3]);
	for(int i = 0;i<massiv.length;i++) {
		for(int j = 0;j<massiv[i].length;j++) {
			System.out.println(i + j);
		}
	}
}
}
