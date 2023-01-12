package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
	
    private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Count");
		int count = scanner.nextInt();
		
		int[] returnedArray = readIntegers(count);
		
		System.out.println(findMin(returnedArray));
		System.out.println(Arrays.toString(reverse(returnedArray)));
		
		

	}
	public static int[] readIntegers(int count) {
		
		int[] array = new int[count];
		System.out.println("Enter a number");
		for(int i=0;i<array.length;i++) {
			
			int number = scanner.nextInt();
			//scanner.nextLine();
			array[i]= number;	
		}
		return array;
		
	}
	public static int findMin(int[] array) {
		int minimumValue = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<minimumValue) {
				minimumValue = array[i];
			}
		}
		return minimumValue;
		
		
	}
	public static int[] reverse(int[] array) {
		int length = array.length;
		for(int i =0;i<(length/2);i++) {
			
				int temp = array[i];
				array[i]= array[length-1-i];
				array[length-1-i]= temp;
			
		}
		return array;
	}
	
	
}
