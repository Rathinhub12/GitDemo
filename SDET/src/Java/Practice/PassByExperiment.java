package Java.Practice;

public class PassByExperiment {

	public static void main(String[] args) {
		MyDate date = new MyDate(1, 20, 2008);
		System.out.println("Before passing an object " + date);
		passObject(date);
		System.out.println("After passing an object " + date);
		System.out.println("Before passing a primitive " + date.year);
		passPrimitive(date.year);
		System.out.println("After passing a primitive " + date.year);
		String x = date.toString();
		System.out.println("Before passing a String " + x);
		passString(x);
		System.out.println("After passing a String " + x);
		
		StringBuilder y = new StringBuilder(date.toString());
		System.out.println("Before passing a stringbuilder " + y);
		passStringBuilder(y);
		System.out.println("After passing a stringbuilder " + y);
	}

	public static void passObject(MyDate d) {
		d.year = 2009;
	}

	public static void passPrimitive(int i) {
		i = 2010;
	}

	public static void passString(String s) {
		int yearSlash = s.lastIndexOf('/');
		s = s.substring(0, yearSlash + 1);
		s += "2012";
		System.out.println("New date string: " + s);
	}
	
//	public static void passStringBuilder(StringBuilder s) {
////		int yearSlash = s.lastIndexOf('/');
////		s = s.substring(0, yearSlash + 1);
////		s += "2012";
////		System.out.println("New date string: " + s);
//		StringBuilder str = new StringBuilder();
//		str=s;
//		int yearSlash = str.lastIndexOf("/");
//		str = (StringBuilder)(str.substring(0, yearSlash));
//		
//		
//	}
	public static void passStringBuilder(StringBuilder s) {
	    int yearSlash = s.lastIndexOf("/");
	    s = s.replace(yearSlash + 1, s.length(), "2012");
	    System.out.println("New date stringbuilder: " + s);
	}
}
