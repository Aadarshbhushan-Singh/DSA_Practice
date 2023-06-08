public class Any_Base_Subtraction
{
	public static void main(String[] args) {
		int num1 = 202;
		int num2 = 21;
		int base1 = 7;
		
		int num3 = 1000;
		int num4 = 100;
		int base2 = 10;
		
		System.out.println(anyBaseSubtraction(num1, num2, base1));
		System.out.println(anyBaseSubtraction(num3, num4, base2));
	}
	
	public static int anyBaseSubtraction(int num1, int num2, int base){
	   int ans = 0;
	   int b = 0;
	   int p = 1;
	   while(num1 > 0 || num2 > 0){
	       int ld1 = num1 % 10;
	       int ld2 = num2 % 10;
	       num1 = num1 / 10;
	       num2 = num2 / 10;
	       if(b != 0){
	           ld1 = ld1 - 1;
	       }
	       if(ld1 < ld2){
	           b=1;
	           ld1 = ld1 + base;
	       }
	       
	       ans = ans + (ld1 - ld2) * p;
	       p = p * 10;
	   }
	   
	   return ans;
	}
	
	
}