package Array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args) {
	    boolean quit = false;
	    int choice =0;
	    printInstruction();
	    while(!quit) {
	    	System.out.println("Enter a Choice: ");
	    	choice = scanner.nextInt();
	    	scanner.nextLine();
	    	switch(choice) {
	    	case 0: 
	    		printInstruction();
	    		break;
	    	case 1:
	    		groceryList.printGroceryList();
	    		break;
	    	case 2:
	    		addGroceryItem();
	    		break;
	    	case 3:
	    		modifyGroceryItem();
	    		break;
	    	case 4:
	    		removeGroceryItem();
	    		break;
	    	case 5:
	    		searchForItem();
	    		break;
	    	case 6:
	    		processArrayList();
	    	case 7:
	    		quit =true;
	    		break;
	    	
	    	}  		
	    	}	    
	    }
	    	
 	
      public static void printInstruction() {
    	  System.out.println("\nPress");
    	  System.out.println("\t 0 - To print choice options.");
    	  System.out.println("\t 1 - To print the lis of Grocery items.");
    	  System.out.println("\t 2 - To add an item to the item");
    	  System.out.println("\t 3 - To modify an item to the item.");
    	  System.out.println("\t 4 - To remove an item to the item");
    	  System.out.println("\t 5 - To search an item to the item");
    	  System.out.println("\t 6 - To close the application.");
    	  }
    	  public static void addGroceryItem() {
    	  System.out.print("please enter the grocery item: ");
    	  groceryList.addGroceryList(scanner.nextLine());
    	  }
    	  public static void modifyGroceryItem() {
    	  System.out.print("Current Item Name: ");
    	  String itmeNumber = scanner.nextLine();
    	  System.out.print("please enter the replacement item: ");
    	  String newItem = scanner.nextLine();
    	  groceryList.modifyGroceryItem(itmeNumber, newItem);
    	  }
    	  public static void removeGroceryItem() {
    	  System.out.print("please enter the item Name: ");
    	  String itmeNumber = scanner.nextLine();
    	  scanner.nextLine();
    	  groceryList.removeGroceryItem(itmeNumber);
    	  }
    	  public static void searchForItem() {
    	      System.out.print("Item to search for: ");
    	      String searchItem = scanner.nextLine();
    	  if(groceryList.onFile(searchItem)) {
    	      System.out.println("Found"+searchItem+"in our grocery");
    	  }else {
    		  System.out.println(searchItem+" not on file.");
    	  }
    	  
    	  }
    	  public static void processArrayList() {
    		  ArrayList <String> newArray = new ArrayList<String>();
    		  newArray.addAll(groceryList.getGroceryList());
    		  
    		  String[] myArray = new String [groceryList.getGroceryList().size()];
    		  myArray = groceryList.getGroceryList().toArray(myArray);
    		  
    	  }
    	  }





































































////public static void main(String[] args) {
//////// TODO Auto-generated method stub
//////int[] myIntArray = new int[10];
////////{1,2,3,4,5,6,7,8,9,10};
////////myIntArray[5]= 50;
//////double[] myDoubleArray = new double[10];
//////System.out.println(myIntArray[5]);
//////System.out.println(myIntArray[0]);
//////System.out.println(myIntArray[4]);
////
////
////
////
////}
////}
//private static Scanner scanner = new Scanner(System.in);
//public static void main(String[] args) {
//int[] myIntegers = getIntegers(5);
//printArray(myIntegers);
//sortIntegers(myIntegers);
//System.out.println(Arrays.toString(myIntegers));
////1printArray(myIntegers);
//
//
////System.out.println("Average = "+getAverage(myIntegers));
//}
//
//public static int[] getIntegers(int number) {
//System.out.println("Enter "+number+" Integer values.\r");
//int[] values = new int[number];
//for(int i=0;i<values.length;i++) {
//	values[i] =scanner.nextInt();
//}
//return values;
//}
//
////public static double getAverage(int[] array) {
////int sum = 0;
////for(int i=0;i<array.length;i++) {
////	sum += array[i];
////}
////return (double)sum/(double)array.length;
////}
//public static void printArray(int[] array) {
//for(int i=0;i<array.length;i++) {
//	System.out.println("Element "+ i +", Typed Value was "+array[i]);
//}
//}
//public static int[] sortIntegers(int[] array) {
//
//
//for(int i =0;i<array.length;i++) {
//	for(int j =0;j<=i;j++) {
//		if(array[i]>array[j]) {
//			int var =array[j];
//			array[j]=array[i];
//			array[i]= var;
//		  
//		}
//		
//	}
//}
//return array;
//
//}

