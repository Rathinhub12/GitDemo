package forStatement;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		isPalindrome(101);
	}
//   public static boolean isPalindrome(int num) {
//	   if(num>10 || num<-10) {
//		   int reverse = 0;
//		   int count = 1;
//		   int num1 = num;
//		     while(num1 !=0) {
//		        int lastDigit = num1%10;
//		        num1 = num1/10;
//		        reverse = reverse+ lastDigit*count;
//		        count = count*10;
//	   }
//		if(reverse == num) {
//			return true;
//		}
//   }
//	   return false;
//}
//}
     public static boolean isPalindrome(int number) {

if(number>10 || number<-10) {

int reversedNumber = 0; //0
int num1 = number;
while(num1!=0) {

int lastdigit = num1%10; //121 last digit=1
num1= num1/10; //number 12
reversedNumber= ((reversedNumber*10) + lastdigit);
System.out.println(reversedNumber+"!!!!!!!!!!!!!!!!!!!!!!");
}System.out.println(reversedNumber+"**********************");
if(reversedNumber==number) {
System.out.println("Palindrome number");
return true;
}
else{System.out.println("Not a Palindrome number");
return false;
}
}
return false;

}
}