package Methods;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public static void printFactors (int num1) {
		if(num1<1) {
		System.out.println("Invalid Value");
		}
		else{

		int var=1;
		for(int i=1;i<=num1;i++) {
		if(num1%i==0) {
		System.out.println(i);
		}
		}
		}
		}
	
	public static boolean isPerfectNumber(int number) {
		if(number<1) {
			System.out.println("Invalid Value");
			return false;
			}
			else{

			int sum=0;
			for(int i=1;i<number;i++) {
			if(number%i==0) {
			System.out.println(i);
			sum = sum+i;
			
			}
			}if(sum == number) {
				System.out.println("perfect Number");
				return true;
			}
			}
		return false;
	}

}
