package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] strings = new String[5];
		strings[0] = "1";
		strings[1] = "2";
		strings[2] = "3";
		strings[3] = "4";
		strings[4] = "5";

		print(strings);

		everyOther(strings);
		reverse(strings);
		random(strings);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	public static void print(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverse(String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	public static void everyOther(String[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				System.out.println(array[i]);
			}
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	public static void random(String[] array) {
		
	}

}
