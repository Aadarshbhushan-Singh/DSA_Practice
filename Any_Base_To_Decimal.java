public class Any_Base_To_Decimal
{
	public static void main(String[] args) {
		int num = 1000;
		int base = 8;
		
		System.out.println(anyBaseToDecimal(num, base));
	}
	
	public static int anyBaseToDecimal(int num, int base){
	    int ans = 0;
	    int p = 0;
	    while(num > 0){
	        int rem = num % 10;
	        num = num / 10;
	        ans = ans + rem * (int)Math.pow(base, p);
	        p++;
	    }
	    
	    return ans;
	}
}