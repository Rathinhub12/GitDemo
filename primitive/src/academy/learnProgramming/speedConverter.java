package academy.learnProgramming;

public class speedConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
   // printConversion(10.25);
   // printMegaBytesAndKiloBytes(2500);
   // boolean result = shouldWakeUp(true,0);
   // System.out.println(result);
    
    boolean leapYear = isLeapYear(-1024);
    System.out.println(leapYear);
	}
//	public static long toMilesPerHour(double kilometersPerHour){
//	    if(kilometersPerHour<0){
//	        return -1;
//	    }else{
//	        long milesPerHour = Math.round(kilometersPerHour/1.609);
//	        return milesPerHour;
//	    }
//		
//	}
//	
//	public static void printConversion(double kilometersPerHour){
//	    if(kilometersPerHour<=0){
//	        System.out.println("Invalid Value");
//	    }else{
//	        long milesPerHour = toMilesPerHour(kilometersPerHour);
//	        System.out.println(kilometersPerHour +" km/h = " + milesPerHour + " mi/h");
//	    }
//	}
//	
//	public static void printMegaBytesAndKiloBytes(int kiloBytes){
//	      if(kiloBytes<0){
//	          System.out.println("Invalid Value");
//	      }else{
//	          int megaBytes = kiloBytes/1024;
//	      int remainingKiloBytes = kiloBytes%1024;
//	      System.out.println(kiloBytes + " KB = "+ megaBytes +" MB and " + remainingKiloBytes + " KB");
//	      }
//	  }
//	
//	
//	
//	public static boolean shouldWakeUp(boolean barking,int hourOfDay){
//	     if(barking == true){
//	     if(hourOfDay<0 || hourOfDay>23){
//	         return false;
//	     }else if(hourOfDay<8 || hourOfDay>22){
//	         return true;
//	     }
//	     } 
//	     return false;
//	    
//	 }
	public static boolean isLeapYear(int year) {
		if(year>=1 && year<=9999) {
			if(year%4==0) {
				if(year%100 == 0) {
					if(year%400 == 0) {
						return true;
					}else {
						return false;
				}
				
			}else {
				return true;
			}
		}else{
			return false;
		}
	}else{
		return false;
	}
}
	
	public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) {
		num1 = (num1*1000);
		num2 = (num2*1000);
		int a = (int)num1;
		int b = (int)num2;
		if (a == b)
        {
            return true;
        }
        else
        {
            return false;
        }
	}
}


    
    

