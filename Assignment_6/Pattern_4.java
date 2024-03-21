package Assignment_6;

public class Pattern_4 {
	 public static void main(String args[])
	    {
	        int n = 3;
	        int i, j;
	        int num = 1;
	        for (i = 1; i <= n; i++) 
	        {
	            for (j = 1; j <= n - i; j++)
	            {
	                System.out.print(" ");
	            }
	            for (j = 1; j <= 2 * i - 1; j++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        for (i = n-1; i >= 1; i--)
	        {
	            for (j = 1; j <= n - i; j++) 
	            {
	                System.out.print(" ");
	            }
	            for (j = 1; j <= 2 * i - 1; j++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }

}
