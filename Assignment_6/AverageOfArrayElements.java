package Assignment_6;

import java.util.Scanner;

public class AverageOfArrayElements {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,sum=0,avg;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			System.out.println("enter "+i+" element " );
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		//System.out.println(sum);
		avg=sum/a.length;
		System.out.println("avrage of array elements are : "+avg);
		
	}

}
