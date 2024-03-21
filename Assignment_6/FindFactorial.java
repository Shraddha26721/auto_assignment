package Assignment_6;

import java.util.Scanner;

public class FindFactorial {
		public static void main(String[] args) {
			int i, fact=1;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter number :");
			i=sc.nextInt();
			while(i>0)
			{
				
				fact=fact*i;
				
				i--;
			}
			System.out.println("factorial number is = "+fact);
		
		}
}
