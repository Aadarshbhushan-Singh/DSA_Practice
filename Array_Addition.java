
public class Array_Addition
{
	public static void main(String[] args) {
		int[] arr1 = {2,3,4,5,6};
		int[] arr2 = {0,0,0,0};
		int pointer1 = arr1.length-1;
		int pointer2 = arr2.length-1;
		
		int[] ans = new int[pointer1 + 2];
		int pointer3 = ans.length-1;
		
		int carry=0;
		
		while(pointer2 >= 0){
		    int ele1 = arr1[pointer1];
		    int ele2 = arr2[pointer2];
		    pointer1--;
		    pointer2--;
		    
		    int sum = ele1 + ele2 + carry;
		    
		    if(sum > 9){
		        sum = sum % 10;
		        ans[pointer3] = sum;
		        carry = 1;
		    }else{
		        carry=0;
		        
		        ans[pointer3] = sum;
		    }
		    pointer3--;
		}
		
		while(pointer1 >= 0){
		    if(carry == 1){
		        ans[pointer3] = arr1[pointer1] + carry;
		        carry = 0;
		    }else{
		        ans[pointer3] = arr1[pointer1];
		    }
		    
		    pointer1--;
		    pointer3--;
		}
		
		if(carry!=0){
		    ans[0] = 1;
		}
		
		for(int ele: ans){
		    System.out.print(ele + " ");
		}
	}
}
