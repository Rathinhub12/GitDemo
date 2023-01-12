package academy.learnProgramming;

public class methodOverloading {
	private static final String INVALID_VALUE_MESSAGE = "Invalid Value"; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String result = getDurationString(63,58);
//		System.out.println(result);
		
//		String result = getDurationString(-543);
//		System.out.println(result);
		
		double result = area(12);
		System.out.println(result);
		
		double result1 = area(12,15);
		System.out.println(result1	);
		
		printYearsAndDays(561600);
		
		boolean cat = isCatPlaying(false,35);
		System.out.println(cat);
		

	}
   public static String getDurationString(int minutes,int seconds) {
	   if((minutes<0) ||(seconds<0 || seconds>59)) {
		 return "Invalid Value";
	   }else {
		   seconds = (minutes *60)+seconds;
		   int hour = seconds/3600;
		   int RemainingSeconds = seconds%3600;
		   minutes = RemainingSeconds/60;
		   int secondValue = RemainingSeconds%60;
		   return (hour +"h "+ minutes +"m "+ secondValue+"s");
	   }
   }
   
   public static String getDurationString(int seconds) {
	   if(seconds<0) {
		   return "Invalid Value";
	   }else {
		   int minutes = seconds/60;
		   int remainingSeconds = seconds%60;
		   return getDurationString(minutes,remainingSeconds);
	   }
   }
   
   public static double area(double radius) {
	   if(radius<0) {
		   return -1;
	   }else {
		   double area = ((Math.PI) *radius*radius);
		   return area;
	   }
   }
   
   public static double area(double X,double Y) {
	   if (X<0 || Y<0) {
		   return -1;
	   }else {
		   double area = X * Y;
		   return area;
	   }
   }
   
   public static void printYearsAndDays(long minutes) {
	   if(minutes<0) {
		   System.out.println("Invalid Value");
	   }else {
		   long day = (minutes/(24*60));
		   long year = (day/365);
		   long remainingDay = (day%365);
		   System.out.println(minutes+" min = "+year+" y and "+remainingDay+" d");
	   }
   }
   
   public static void printEqual(int a,int b,int c) {
	   if(a<0 || b<0 || c<0) {
		   System.out.println("Invalid Value");
	   }else if((a == b)&& (b== c)&& (c == a)) {
		   System.out.println("All numbers are equal");
	   }else if((a!=b)&& (b!=c)&& (c!=a)) {
		   System.out.println("All numbers are different"); 
	   }else {
		   System.out.println("Neither all are equal or different");
	   }
   }
   
   public static boolean isCatPlaying(boolean summer,int temparature) {
	   if (summer == true) {
		   if((temparature<25) ||(temparature>45)) {
			   return false;
		   }else {
			   return true;
		   }
	   }
	   else {
		   if((temparature<25) ||(temparature>35)) {
			   return false;
		   }else {
			   return true;
	   }
   }
	
}
}