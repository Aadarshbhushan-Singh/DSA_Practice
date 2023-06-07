public class Decimal_to_any_base
{
	public static void main(String[] args) {
		int num = 634;
		int base = 8;
		System.out.println(decimalToAnyBase(num, base));
        
	}
	
	public static int decimalToAnyBase(int num, int base){
	    int ans = 0;
	    int fac = 1;
	    
	    while(num > 0){
	        int rem = num % base;
	        ans = ans * 10 + rem;
	        num = num / base;
	    }
	    
	    return reverseNumber(ans);
	}
	
	public static int reverseNumber(int num){
	    int ans = 0;
	    int count = countDigit(num) - 1;
	    while(num > 0){
	        int rem = num % 10;
	        ans = ans * 10 + rem;
	        num = num / 10;
	    }
	    return ans;
	}
	
	
	public static int countDigit(int n){
	    int count = 0;
	    while(n > 0){
	        n = n/10;
	        count++;
	    }
	    
	    return count;
	}
}
