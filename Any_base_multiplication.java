public class Any_base_multiplication
{
	public static void main(String[] args) {
		int num1 = 234;
		int num2 = 76;
		int base = 8;
		
		anyBaseMultiplication(num1, num2, base);
	}
	
	public static int anyBaseMultiplication(int num1, int num2, int base){
	    int finalAns = 0;
	    int resNum1 = num1;
	    int m = 1;
	    while(num2 > 0){
		    int sn = num2 % 10;
		    num2 = num2 / 10;
		    System.out.println("Sn: " + sn);
		    
		    int carry = 0;
		    int ans = 0;
		    int p = 1;
		    
		    while(num1 > 0){
		        int fn = num1 % 10;
		        System.out.println("Fn: " + fn);
		        num1 = num1 / 10;
		        int prod = fn * sn + carry;
		        System.out.println("prod: " + prod);
		        int n2k = prod % base;
		        System.out.println("n2k: " + n2k);
		        ans = n2k * p + ans;
		        System.out.println("ans: " + ans);
		        p = p * 10;
		        carry = prod / base;
		        System.out.println("carry: " + carry);
		    }
		    
		    if(carry != 0){
		        ans = carry * p + ans;
		    }
		    
		    ans = ans * m;
		    m = m * 10;
		    System.out.println("ans: " + ans + "m: " + m);
		    
		    System.out.println(ans);
		    num1 = resNum1;
		    finalAns = anyBaseAddition(finalAns, ans, base);
		}
		
		System.out.println("Finaln answer" + finalAns);
		
		return finalAns;
	}
	
	
	public static int anyBaseAddition(int num1, int num2, int base){
	    int c = 0;
	    int ans = 0;
	    int p = 1;
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
	        ans = ald * p + ans;
	        p = p * 10;
	    }    
	    
	    if(c != 0){
	        ans = c * p + ans;
	    }
	    return ans;
	}
	
	
}
