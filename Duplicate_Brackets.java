import java.util.*;

public class Duplicate_Brackets
{
	public static void main(String[] args) {
		String str1 = "(a+b)+(c+d)";
		String str2 = "(a+b)+((c+d))";
		
		//Code doesn't work for this type of case because it is chekcing is there any content inside the bracket not the validity of bracket.
		String str3 = "()";
		
		System.out.print(checkDuplicateBrackets(str3));
	}
	
	public static boolean checkDuplicateBrackets(String str1){
	    int len = str1.length();
	    
        Stack<Character> st = new Stack<>();	    
	    
	    int i = 0;
	    while(i < len){
	        char c = str1.charAt(i);
	        if(c == ')'){
	            if(st.peek() == '('){
	                return false;
	            }
	            while(st.peek()!='('){
	                st.pop();
	            }
	            st.pop();
	        }else{
	            st.push(c);
	        }
	        i++;
	    }
	    
	    
	    return true;
	}
}
