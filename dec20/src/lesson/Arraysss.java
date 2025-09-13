package lesson;
import java.util.Arrays;
public class Arraysss {
public static void main(String[] args) {
	int[] array = {1,5,21,56,215,1231,51,35,1325,1235};
	int index = Arrays.binarySearch(array, 21);
	System.out.println(index);
	int[] a1 = {22135,315,141,6756,1,2,3,4};
	int[]Newa1 = Arrays.copyOf(a1, 7);
	for(int i : Newa1) {
		System.out.println(i);
	}
	int[] a2 = {1,2,3,4,5};
	int[] part = Arrays.copyOfRange(a2, 1, 4);
	for (int i : part) {
		System.out.println(i);
	}
	System.out.println(Arrays.toString(a2));
	int[] a3 = new int[10];
	Arrays.fill(a3, 7);
	System.out.println(Arrays.toString(a3));
	int[] a5 = {1,2,3};	
	int[] a6 = {1,2,3};	
    System.out.println(Arrays.equals(a6, a5));
    int[] a7 = {1,2,3,4,5,5,6,7,8,9,0};
   Arrays.sort(a7);
   System.out.println(Arrays.toString(a7));
}
}
