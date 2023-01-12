package forStatement;

public class forPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double amount = 10000.0;
		for(int i=2;i<9;i++) {
	    	  double result =(calculateInterest(amount,i));
	    	   System.out.println(String.format("%.2f",result));
	    	   
	   sumOdd(-1,9); 	   
	}

}
   public static double calculateInterest(double amount,double interestRate) {
	 return(amount*(interestRate/100));
 }
   
   public static boolean isOdd(int num) {
	   if(num<0) {
		   return false;
	   }else if(num%2 == 0) {
		   return false;
	   }
	   return true;
   }
   
   public static int sumOdd(int start,int end) {
	   int sum =0;
	   if((end<start)||(start<=0 || end<=0)) {
		   return -1;
	   }else {
	   for(int i=start;i<=end;i++) {
		  // boolean result = isOdd(i);
		   if(isOdd(i)) {
			   sum +=i;
		   } 
	   }
	   System.out.println(sum); 
	   return sum;
	   
   }
   }	   
	   
   
   
}