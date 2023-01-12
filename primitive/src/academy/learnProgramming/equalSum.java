package academy.learnProgramming;

public class equalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    boolean result = hasEqualSum(1,-1,0);
    		System.out.println(result);
    		
    		
    		boolean resultteen = hasTeen(23,22,34);
    		System.out.println(resultteen);
    		
    		
    		double results = calcFeetAndInchesToCentimeters(7,5);
    		System.out.println(results);
    		
	}
   public static boolean hasEqualSum(int num1,int num2,int num3) {
	   int total = num1+num2;
	   if(total == num3) {
		   return true;
	   }
	   return false;
   }
   
   public static boolean hasTeen(int num1,int num2,int num3) {
	   if((num1>=13 && num1<=19) || (num2>=13 && num2<=19) ||(num3>=13 && num3<=19)) {
		   return true;
	   }
		return false;   
   }
   
   public static double calcFeetAndInchesToCentimeters(double feet,double inches ) {
	   if ((feet<0) || (inches<0 || inches>12)) {
		   return -1;
	   }else {
		   double result = ((feet *12*2.54) + (inches*2.54));
		   return result;
	   }
   }   
	   public static double calcFeetAndInchesToCentimeters(double inches ) {
		   if (inches<=0) {
			   return -1;
		   }else {
			   double feet = (int)(inches/12);
			   double remainingInches = (int)(inches%12);
			   return calcFeetAndInchesToCentimeters(feet,remainingInches);
		   }
   }
   
}
