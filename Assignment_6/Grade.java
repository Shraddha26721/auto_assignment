package Assignment_6;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage : ");
		double percentage = scan.nextDouble();

		if(percentage >= 90){
			System.out.println("grade : AA");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("grade : AB");
		}else if(percentage < 80 && percentage >= 70){
			System.out.println("grade : BB");
		}else if(percentage < 70 && percentage >= 60){
			System.out.println("grade : BC");
		}else if(percentage < 60 && percentage >= 50){
			System.out.println("grade : CD");
		}else if(percentage < 50 && percentage >= 40){
			System.out.println("grade : DD");
		}else {
			System.out.println("Fail");
		}
	}



}
