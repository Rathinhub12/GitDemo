package academy.learnProgramming;

public class threeDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=25.5589;
				double y=25.55846;
		x = (x * 1000);
		System.out.println(x);
       int a = (int) x ;
        System.out.println(a);

        y = (y * 1000);
        int b = (int) y;

        if (a == b)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }

	}

}
