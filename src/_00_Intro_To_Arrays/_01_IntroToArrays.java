package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
    	Random ran=new Random();
    	int temp, size;
        // 1. declare and Initialize an array 5 Strings
    	 String[] array = new String[5];
    	 array[0]="0";
    	 array[1]="1";
    	 array[2]="2";
    	 array[3]="3";
    	 array[4]="4";
        // 2. print the third element in the array
    	 System.out.println(array[3]);
        // 3. set the third element to a different value
    	 array[3]="bob";
        // 4. print the third element again
    	 System.out.println(array[3]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	 for (int i = 0; i < array.length; i++) {
			array[i]="the new thing that i am setting these things to";
		}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	 for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
        // 7. make an array of 50 integers
    	 int [] ints=new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	 for (int i = 0; i < ints.length; i++) {
    		 
    		ints[i]=ran.nextInt(100);
		}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	 int smallest=ints[0];
    	for (int i = 0; i < ints.length; i++) {
			if(ints[i]<smallest) {
				smallest=ints[i];
			}
		}
    	System.out.println(smallest+" this is the smallest");
        // 10 print the entire array to see if step 8 was correct
    	//it was
        // 11. print the largest number in the array.
    	int largest=ints[0];
    	for (int i = 0; i < ints.length; i++) {
			if(ints[i]>largest) {
				largest=ints[i];
			}
		}
    	System.out.println(largest+" this is the biggest");
        // 12. print only the last element in the array
    	System.out.println(ints[49]);
    }
}
