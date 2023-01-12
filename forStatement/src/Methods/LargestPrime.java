package Methods;

public class LargestPrime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getLargestPrime(42);
		System.out.println(result);

	}
	public static int getLargestPrime(int num1) {
		int count = 0, primeFactor = 0;
		if (num1 <= 1) {
		return -1;
		  }
		else {
		for (int i = 2; i <= num1; i++) {
		if (num1 % i == 0) {
		for (int j = 2; j <= i; j++) {
		if (i % j == 0) {
		count++;
		}
		}
		if (count == 1) {
		if (primeFactor < i) {
		primeFactor = i;
		}
		}
		count = 0;
		}
		}
		return primeFactor;
		 }
		}
}