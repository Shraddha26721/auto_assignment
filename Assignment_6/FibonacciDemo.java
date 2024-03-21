package Assignment_6;

import java.util.Scanner;

public class FibonacciDemo {
public static void main(String[] args) {
	int n,num1=0,num2=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter nymber : ");
	n=sc.nextInt();
	
	  for (int i = 0; i < n; i++) {
          // Print the number
          System.out.print(num1 + " ");

          // Swap
          int num3 = num2 + num1;
          num1 = num2;
          num2 = num3;
      }
}
}
