import java.util.*;

public class Next_Greater_Element
{
	public static void main(String[] args) {
	    int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
	    
	    
	    solve(arr);
	    
	    
	}
	
	
	
	
     public static void solve(int[] arr){
           int[] ans = new int[arr.length];
           
           Stack<Integer> stk = new Stack<>();
           
           ans[ans.length-1] = -1;
           stk.push(arr[arr.length-1]);
           
           
           for(int i = arr.length-2; i>=0; i--){
              int ele = arr[i];
              
              if(stk.peek() < ele){
                  while(stk.size() > 0 && stk.peek() < ele){
                      stk.pop();
                  }
                  
                  if(stk.size() > 0){
                      ans[i] = stk.peek();
                  }else{
                      ans[i] = -1;
                  }
                  stk.push(arr[i]);
              }else{
                   ans[i] = stk.peek();
                   stk.push(arr[i]);
               }
           
           
            }
             for(int x: ans){
    	        System.out.print(x + " ");
    	    }
    }
}
