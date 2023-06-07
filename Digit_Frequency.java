public class Digit_Frequency
{
	public static void main(String[] args) {
		int num = 98439862;
		int search = 9;
		
		System.out.println(countDigit(num));
		System.out.println(searchNumber(num, search));
	}
	
	public static int searchNumber(int num, int search){
	    int count = countDigit(num) - 1;
	    int finalCount = 0;
	    while(num != 0){
	        int rem = num % 10;
	        if(rem == search){
	            finalCount++;
	        }
	        num = num / 10;
	        count--;
	    }
	    
	    return finalCount;
	}
}