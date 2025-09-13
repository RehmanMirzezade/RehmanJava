package lesson;

import java.util.Arrays;

public class Tapsiriq {
	public static void main(String[] args) {
		String name = "Meherrem";
		System.out.println(name);
		String message = "Java dilini oyrenmek maraqli ve faydalidir";
		System.out.println(message);
		int l = message.length();
		System.out.println(l);
		char c = message.charAt(9);
		System.out.println(c);
		System.out.println(message.indexOf("a"));
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.contains("y"));
		System.out.println(message.startsWith("faydalidir"));
		System.out.println(message.endsWith("faydalidir"));
		name = "    ayxan    ";
		System.out.println(name.trim());
		name = "Ayxan";
		System.out.println(name.substring(0,5));
		name = "Huseyn Mehdizade";
		String[] arr2 = name.split("");
		System.out.println(Arrays.toString(arr2));
	}


}
