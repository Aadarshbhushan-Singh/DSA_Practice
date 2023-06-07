public class Printing_W
{
	public static void main(String[] args) {
		int n = 7;
		
		
		for(int i = 1; i <= n; i++){
		    for(int j = 1; j <= n; j++){
		        if(i > n/2 && (i == j || i + j == n + 1) || (j == 1 || j == n)){
		            System.out.print("* ");
		        }else{
		            System.out.print("  ");
		        }
		    }
		    
		    System.out.println();
		}
	}
}