package forStatement;

public class evenDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getEvenDigitSum(452);

	}
    public static int getEvenDigitSum(int num) {
    	if(num<0) {
    		return -1;
    	}else {
    		int sum =0;
    		//int count=1;
    		int num1=num;
    		while(num1!=0) {
    			int lastDigit = (num1%10);
    			if(lastDigit%2 == 0) {
    				sum = sum+lastDigit;
    				//continue;
    			}
    			num1= (num1/10);
    		}
    		System.out.println(sum);
    		return sum;
    	}
    }
}
