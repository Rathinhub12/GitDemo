package Methods;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = getBucketCount(2.75,3.25,2.5,1);
		System.out.println(r);

	}
    public static int getBucketCount(double width,double height,double areaPerBucket,int extrabuckets) {
    	if((width<=0)||(height<=0)||(areaPerBucket<=0)||(extrabuckets<0)){
    		return -1;
    	}else {
    		double area = height*width;
    		long requiredBuckets = (long) (area/areaPerBucket);
    		int finalCountOfBucket = (int)(requiredBuckets - extrabuckets);
    		return finalCountOfBucket;
    	}
    	
    }
    
    public static int getBucketCount(double width,double height,double areaPerBucket) {
    	if((width<=0)||(height<=0)||(areaPerBucket<=0)){
    		return -1;
    	}else {
    		double area = height*width;
    		long requiredBuckets = Math.round(area/areaPerBucket);
    		//int finalCountOfBucket = (int)(requiredBuckets - extrabuckets);
    		return (int)requiredBuckets;
    	}
    	
    }
    
    public static int getBucketCount(double area,double areaPerBucket) {
    	if((area<= 0) ||(areaPerBucket<=0)){
    		return -1;
    	}else {
    		
    		long requiredBuckets = Math.round(area/areaPerBucket);
    		//int finalCountOfBucket = (int)(requiredBuckets - extrabuckets);
    		return (int)requiredBuckets;
    	}
    	
    }
    
    
}
