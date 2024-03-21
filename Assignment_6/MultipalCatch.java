package Assignment_6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipalCatch {
	public static void main(String[] args) {
		System.out.println("start code");
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter a : ");
			a= sc.nextInt();
			System.out.print("Enter b : ");
			b=sc.nextInt();
			c=a/b;
			System.out.println("Division : "+c);
			
		}catch(ArithmeticException e)
		{
			System.out.println("Exception caudgt : "+e);
		}catch(InputMismatchException e)
		{
			System.out.println("Exception caught : "+e);
		}
		System.out.println("End code");
	}

}
