package forStatement;

public class commonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getGreatestCommonDivisor(10,100);

	}
	
	public static int getGreatestCommonDivisor(int num1,int num2) {
		int var = 1;
		
		if(num1<10 || num2<10) {
			return -1;
		}else {
			 if(num1>=num2) {
			
			     //int n=num2;  
				 for(int i=1;i<=num2;i++) {
				        if(num1%i == 0) {
					       if(num2%i == 0) {
						     var = i;
						     
						     
					}
				}
				
			}
				 System.out.println(var);
			     return var;
		}else {
			for(int i=1;i<=num1;i++) {
		        if(num1%i == 0) {
			       if(num2%i == 0) {
				     var = i;
				     
		             }
			       }
			   }
			System.out.println(var);
		     return var;
		}
	}
	}
	
}
	
   //public static int largestnu

