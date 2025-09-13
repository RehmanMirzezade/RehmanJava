package lesson2;

import java.util.Arrays;

public class Tappsiriq {
	public static void main(String[] args) {
		int[] array = { 1, 6, 8, 23, 214, 52 };
		int index = Arrays.binarySearch(array, 23);
		System.out.println(index);
		Arrays.copyOf(array, 4);
		for (int i : array) {
			System.out.println(i);
		}
		Arrays.copyOfRange(array, 1, 6);
		for (int i : array) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(array));
		int[] equalsarray = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.equals(array, equalsarray));
		int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0} };
		int[][] arr2 =  {{ 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0}};
		System.out.println(Arrays.deepEquals(arr1, arr2));
		Arrays.fill(array, 8);
		System.out.println(Arrays.toString(array));
	}
}
