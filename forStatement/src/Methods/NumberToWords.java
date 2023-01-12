package Methods;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		numberToWords(100);
		//int result = getDigitCount(0);
		//System.out.println(result);
		//Integer.parseInt(reverse(195));
		//System.out.println(result);
	}
	
	public static void numberToWords(int number) {
		
		if(number<0) {
			System.out.println("Invalid Value");
		}else {
			
			if(number>0) {
			
				int num1 = reverse(number);
				int x = num1;
				int y= number;
			//System.out.println(num1);
			while(num1!=0) {
			  int lastDigit = num1%10;
			  switch(lastDigit){
			  case 0:
				  System.out.println("Zero");
				  break;
			  case 1:
				  System.out.println("One");
				  break;
			  case 2:
				  System.out.println("Two");
				  break;
			  case 3:
				  System.out.println("Three");
				  break;
			  case 4:
				  System.out.println("Four");
				  break;
			  case 5:
				  System.out.println("Five");
				  break;
			  case 6:
				  System.out.println("Six");
				  break;
			  case 7:
				  System.out.println("Seven");
				  break;
			  case 8:
				  System.out.println("Eight");
				  break;
			  case 9:
				  System.out.println("Nine");
				  break;
			  }
			  num1 = num1/10;
			
			
		}
			
			int a= getDigitCount(y);
			 int b= getDigitCount(x);
			 if (a>b) {
				 for(int i =0;i<(a-b);i++) {
					 System.out.println("Zero");
				 }
			 }
				
		}else {
			//System.out.println(getDigitCount(0));
			System.out.println("Zero");
		}
			
		 
	}
	}
	
	public static int reverse(int number) {
		
		
			int reversedNumber = 0; //0
		int num1 = number;
		while(num1!=0) {

		int lastdigit = num1%10; //121 last digit=1

		num1= num1/10;
		reversedNumber= reversedNumber*10 + lastdigit;


		}
		//System.out.println(reversedNumber);
		return reversedNumber;
		}
		
	
	public static int getDigitCount(int number) {
		if(number<0) {
			System.out.println("Invalid Value");
			return -1;
			
		}else {
			int count = 0;
			if(number>0) {
			int num1 = number;
			while (num1!=0) {
				int lastdigit = num1%10;
				num1 = num1/10;
				count++;
			}
			//System.out.println(count);
			return count;
		}else {
			return 1;
		}
		
	}

}
	
//	public static int reverse(int number) {
//        int reversed = 0;
//        while (number != 0) {
//            reversed = reversed * 10 + number % 10;
//            number = number / 10;
//        }
//        return reversed;
//}
}