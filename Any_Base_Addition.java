public class Any_Base_Addition
{
	public static void main(String[] args) {
		int num1 = 234;
		int num2 = 343;
		int base1 = 5;
		
		int num3 = 346;
		int num4 = 777;
		int base2 = 8;
		
		System.out.println(anyBaseAddition(num1, num2, base1));
		System.out.println(anyBaseAddition(num3, num4, base2));
	}
	
	public static int anyBaseAddition(int num1, int num2, int base){
	    int c = 0;
	    int ans = 0;
	    while(num1 > 0 || num2 > 0){
    	    int ld1 = num1 % 10;
    	    num1 = num1/10;
    	    int ld2 = num2%10;
    	    num2 = num2/10;
	        int sum = ld1 + ld2 + c;
	        int ald = 0;
	        if(sum >= base){
	            ald = sum - base;
	            c = 1;
	        }else{
	            ald = sum;
	            c = 0;
	        }
	        ans = ans * 10 + ald;       
	    }    
	    
	    if(c != 0){
	        ans = ans * 10 + c;
	    }
	    return reverseNumber(ans);
	}
	
	public static int reverseNumber(int num){
	    int ans = 0;
	    
	    while(num > 0){
	        int rem = num % 10;
	        ans = ans * 10 + rem;
	        num = num / 10;
	    }
	    
	    return ans;
	}
}
