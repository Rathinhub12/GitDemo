package forStatement;

public class firstLastDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumFirstAndLastDigit(100);

	}
   
	public static int sumFirstAndLastDigit(int num) {
		if (num<0) {
			return -1;
		}else {
			int sum =0;
			int num1 = num;
			int count =1;
			int lastDigit = num1%10;
			while(num1>=10) {
				
			   num1 = num1/10;
			   count = count *10;
			   
			
		}
			int firstDigit = num/count;
		    sum = sum+lastDigit+firstDigit;
		    System.out.println(sum);
		    return sum;
	}
}
}