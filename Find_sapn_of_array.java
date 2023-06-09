public class Find_span_of_array
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 1;
		arr[2] = 89;
		arr[3] = 34;
		arr[4] = 4;
		
		
		System.out.println(findSpan(arr));
	}
	
	public static int findSpan(int[] arr){
	    int max = Integer.MIN_VALUE;
	    int min = Integer.MAX_VALUE;
	    
	    for(int ele: arr){
	        if(ele > max){
	            max = ele;
	        }
	        if(ele < min){
	            min = ele;
	        }
	    }
	    
	    return max - min;
	}
}