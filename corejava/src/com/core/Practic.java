package com.core;

import java.util.Scanner;

public class Practic {
	public static void main(String[] args) {
		int i,sum=0,j,temp;
		int a[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Array Element : ");
		for(i=0;i<a.length;i++)
		{
			System.out.print("enter "+i+" element : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
			
		}
		System.out.println("Array elements are : ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("a ["+i+"] is : "+a[i]);
		}
		System.out.println("sum : "+sum);
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
System.out.println("Array elements are asscending : ");
		
		for(i=0;i<a.length;i++)
		{
			System.out.println("a ["+i+"] is : "+a[i]);
		}
		
		
	}

}
