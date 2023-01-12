package Methods;

public class NumberInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		getDaysInMonth(2,100);
		int result = getDaysInMonth(12,10000);
		System.out.println(result);
		
	
		
	}

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
	
        
        public static int getDaysInMonth(int month,int year) {
        	if((month<1 || month>12) || (year<1 || year>9999)) {
        		return -1;
        	   } else if (isLeapYear(year)){
        		  
        		   switch (month) {
        		   
        		     case 1:
        		    	 //System.out.println("january month has 31 days");
        		    	 return 31;
        		     case 2:
        		    	// System.out.println("February month has 29 days");
        		    	 return 29;
        		     case 3:
        		    	 //System.out.println("March month has 31 days");
        		    	 return 31;
        		     case 4:
        		    	// System.out.println("April month has 30 days");
        		    	 return 30;
        		     case 5:
        		    	// System.out.println("May month has 31 days");
        		    	 return 31;
        		     case 6:
        		    	// System.out.println("jane month has 30 days");
        		    	 return 30;
        		     case 7:
        		    	// System.out.println("july month has 31 days");
        		    	 return 31;
        		     case 8:
        		    	 //System.out.println("August month has 31 days");
        		    	 return 31;
        		     case 9:
        		    	 //System.out.println("September month has 30 days");
        		    	 return 30;
        		     case 10:
        		    	 //System.out.println("October month has 31 days");
        		    	 return 31;
        		     case 11:
        		    	 //System.out.println("November month has 30 days");
        		    	 return 30;
        		     case 12:
        		    	 //System.out.println("December month has 31 days");
        		    	 return 31;
        		      
        		   }
        	   }else if(!isLeapYear(year)) {
        		   switch (month) {
        		   
      		     case 1:
      		    	 //System.out.println("january month has 31 days");
      		    	 return 31;
      		     case 2:
      		    	// System.out.println("February month has 28 days");
      		    	 return 28;
      		     case 3:
      		    	// System.out.println("March month has 31 days");
      		    	 return 31;
      		     case 4:
      		    	 //System.out.println("April month has 30 days");
      		    	 return 30;
      		     case 5:
      		    	 //System.out.println("May month has 31 days");
      		    	 return 31;
      		     case 6:
      		    	 //System.out.println("jane month has 30 days");
      		    	 return 30;
      		     case 7:
      		    	// System.out.println("july month has 31 days");
      		    	 return 31;
      		     case 8:
      		    	// System.out.println("August month has 31 days");
      		    	 return 31;
      		     case 9:
      		    	// System.out.println("September month has 30 days");
      		    	 return 30;
      		     case 10:
      		    	// System.out.println("October month has 31 days");
      		    	 return 31;
      		     case 11:
      		    	 //System.out.println("November month has 30 days");
      		    	 return 30;
      		     case 12:
      		    	// System.out.println("December month has 31 days");
      		    	 return 31;
      		      
      		   }
        		   
        	   }
        	return -1;
        }
        	
        	
        	
        }

