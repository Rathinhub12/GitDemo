package forStatement;

public class flourPack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canPack(-3,2,12);

	}
   public static boolean canPack(int bigCount,int smallCount,int goal) {
	  int sum = 0;
	  sum = ((bigCount*5) + smallCount);
	   if(bigCount<0 || smallCount<0 || goal<0) {
		   System.out.println("Out of range");
		   return false;
	   }else if(sum == goal) {
		   System.out.println("Possible");
		   return true;
	   }else {
		   int sum1 = 0;
		   for(int i=0;i<=bigCount;i++) {
			   for(int x=0;x<=smallCount;x++) {
				   sum1 = (5*i + x);
				   if(sum1 == goal) {
					   System.out.println("Possible");
					   return true;
				   }
			   }
		   }
		   return false;
	   }
	   
   }
}

//bigCountKilo = 5*bigCount;
//smallCountKilo = 1*smallCount;
//goal-bigCountKilo>smallCount