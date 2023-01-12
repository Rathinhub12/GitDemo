package academy.learnProgramming;

public class forStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       for(int i=2;i>9;i++) {
    	   double amount = 10000.0;
    	   System.out.println("Interest is " + calculateInterest(amount,i) );
       }
	}
   public static double calculateInterest(double amount,double interestRate) {
	 return(amount*(interestRate/100));
 }
}
