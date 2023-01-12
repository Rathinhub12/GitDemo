package Methods;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputThenPrintSumAndAverage();
	}
	
	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter a number: ");
		int sum =0;
		long average = 0;
		int counter = 0;
		
		while(true) {
			
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt) {
				
			int number = scanner.nextInt();
			counter++;
			sum +=number;
			average =Math.round((double) sum/(double)counter);
		}else {
			break;
		}
			scanner.nextLine();
		}
		System.out.println("Sum = " +sum + "average = "+ average);
		scanner.close();
	}
		
		
		
	


}
