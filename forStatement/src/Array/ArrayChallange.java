package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallange {
	

	

	private static Scanner scanner =  new Scanner(System.in);

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] myInteger = getIntegers(5);
	printIntegers(myInteger);
	sortIntegers(myInteger);
	  }
	public static int[] getIntegers(int number) {
	System.out.println("Enter " +number + " integer value.\r");
	int[] values = new int[number];
	for(int i =0;i<values.length;i++) {
	values[i]= scanner.nextInt();
	}
	return values;
	}

	public static void printIntegers(int[] array) {
	for(int i=0;i<array.length;i++) {
	System.out.println("At place "+i+" value typed is "+array[i]);
	System.out.println("At place "+i+" value typed is "+Arrays.toString(array));
	}
	}

	public static int[] sortIntegers(int[] array) {
	System.out.println("Sorted integer array is: \r");
	for(int i=0;i<array.length;i++) {
	for(int j=0;j<=i;j++) {
	if(array[j]<=array[i]) {
	int var =array[j];
	array[j]=array[i];
	array[i]= var;
	}
	//array[j]=array[j];
	}
	}
	System.out.println(Arrays.toString(array));

	for(int i=0;i<array.length;i++) {
	System.out.println(array[i]);//"At place "+i+" value typed is "+
	}
	return array;
	}
	}



