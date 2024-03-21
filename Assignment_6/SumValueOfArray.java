package Assignment_6;

import java.util.Scanner;

public class SumValueOfArray {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
	}

}
