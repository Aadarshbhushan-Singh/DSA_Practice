public class Array_Subtraction
{
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6};
		int[] arr2 = {2,0,0,0,0};
		
		int pointer1 = arr1.length-1;
		int pointer2 = arr2.length-1;
		
		int[] ans = new int[pointer1 + 1];
		int pointer3 = ans.length-1;
		
		int borrow = 0;
		
		while(pointer2 >= 0){
		    int ele1 = arr1[pointer1];
		    int ele2 = arr2[pointer2];
		    pointer1--;
		    pointer2--;
		    
		    int diff = ele1 - ele2;
		    
		    if(diff < 0){
		        diff = diff + 10;
		        arr1[pointer1 - 1] = arr1[pointer1 -1] - 1;
		        
		    }
		    ans[pointer3] = diff;
		    pointer3--;
		}
		
		while(pointer1 >= 0){
		    ans[pointer3] = arr1[pointer1];
		    pointer1--;
		    pointer3--;
		}
		
		
		
		for(int ele: ans){
		    System.out.print(ele + " ");
		}
	}
}
