import java.util.*;

public class CheckBalancedBrackets
{
	public static void main(String[] args) {
		String exp1 = "[(a+b)+{(c+d)+e}]()";
		String exp2 = "[(a+b)+{(c+d)+e}}]";
		
		System.out.println(checkBalancedBracket(exp1));
		System.out.println(checkBalancedBracket(exp2));
	}
	
	
	public static boolean checkBalancedBracket(String exp){
        Stack<Character> stk = new Stack<>();
        
        int len = exp.length();
        int i = 0;
        
        while(i < len){
            char ch = exp.charAt(i);
            
            if(ch == '[' || ch == '{' || ch == '('){
                stk.push(ch);
                
            }else if(ch == ')'){
                if(stk.peek() == '('){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(ch == '}'){
                if(stk.peek() == '{'){
                    stk.pop();
                }else{
                    return false;
                }
            }else if(ch == ']'){
                if(stk.peek() == '['){
                    stk.pop();
                }else{
                    return false;
                }
            }
            
            
            i++;
        }
        
        if(stk.size() == 0){
                return true;
        }
            
        return false;
            
	}
}
