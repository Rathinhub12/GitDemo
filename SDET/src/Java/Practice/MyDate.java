package Java.Practice;

public class MyDate {
	public byte day;
	public byte month;
	public short year;
	
	public MyDate(int day, int month, int year) {
		super();
		this.day = (byte)day;
		this.month =(byte) month;
		this.year = (short)year;
	}
	
	public MyDate() {                 //Default Constructor
		this(1,1,1900);
		}


	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
	
	public void setDate(int m, int d, int y) {
		if (valid(d, m, y)) {
		day = (byte)d;
		year = (short)y;
		month = (byte)m;
	}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		 if (valid(day, month, year)) {
			 this.day = (byte)day;
			 }

	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = (byte)month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = (short)year;
	}
	
	private boolean valid(int day, int month, int year){
		 if (day > 31 || day < 1 || month > 12 || month < 1 ){
		 System.out.println("Attempting to create a non-valid date "
		+ month + "/" + day + "/" + year);
		 return false;
		 }
		 switch (month){
		 case 4:
		 case 6:
		 case 9:
		 case 11: return (day <= 30);
		 case 2: return day <= 28 || ( day == 29 && year % 4 == 0) ;
		 }
		 return true;
		}
	
	
	//////////Arrays
	private static MyDate[] holidays;
	static {
		 holidays = new MyDate[6];
		 //... complete the initialization of the holidays array.
		 holidays[0]= new MyDate(1,1,2020);
		 holidays[1]= new MyDate(5,9,2020);
		 holidays[2]= new MyDate(30,5,2020);
		 holidays[3]= new MyDate(24,11,2020);
		 holidays[4]= new MyDate(4,7,2020);
		 holidays[5]= new MyDate(25,12,2020);
		 
		}
	public static MyDate[] getHolidays() {
		return holidays;
	}
	public static void listHolidays() {
		 System.out.println("the holidays are:");
		 for (int x = 0; x < holidays.length; x++){
		 System.out.println(holidays[x]);
		 }
		}



	
	

}
