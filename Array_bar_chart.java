public class Array_bar_chart
{
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 3;
		arr[1] = 1;
		arr[2] = 0;
		arr[3] = 7;
		arr[4] = 5;
		
		
		barGraph(arr);
	}
	
	public static void barGraph(int[] arr){
	    //Finding max value 
	    int max = arr[0];
	    for(int ele: arr){
	        if(ele > max){
	            max = ele;
	        }
	    }
	    
	    //Subtracting all the elements from max value
	    for(int i = 0; i < arr.length; i++){
	        arr[i] = max - arr[i];
	    }
	    
	    for(int ele: arr){
	        System.out.print(ele);
	    }
	    
	    while(max > 0){
    	    for(int i = 0; i < arr.length; i++){
    	        if(arr[i] <= 0){
    	            System.out.print("* ");
    	        }else{
    	            System.out.print("  ");
    	        }
    	        arr[i] = arr[i] - 1;
    	    }
    	    System.out.println();
    	    max--;
	    }
	}
}