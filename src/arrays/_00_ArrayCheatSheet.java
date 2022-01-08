package arrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static int getSmallest(int[] a, int total){  
		Arrays.sort(a);  
		return a[0];  
	} 
	public static int getLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-1];  
	}
	public static void main(String[] args) {
		Random random = new Random();
		//1. make an array of 5 Strings
		String[] names = {"sonia", "manav","ani", "sof", "brooke"};
		//2. print the third element in the array
		//sonis notes:  remember, array elements go 0,1,2... NOT 1,2,3...
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="anika";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i=0;i<names.length;i++) {
		     System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int[] integer = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i=0;i<integer.length;i++) {
			int randNum = random.nextInt(50);
		     integer[i]=randNum;
		}
		
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(getSmallest(integer,50));
		//9 print the entire array to see if step 8 was correct
		for (int i=0;i<integer.length;i++) {
		     System.out.println(integer[i]);
		}		
		//10. print the largest number in the array.
		System.out.println(getLargest(integer,50));
	}
}