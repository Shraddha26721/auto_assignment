package Assignment_6;

import java.util.Scanner;

public class InSufficiantFund {
	public static void main(String[] args) throws InsufficiantFundException {
		System.out.println("plese enter amount for withdraw : ");
		Scanner sc=new Scanner(System.in);
		int amt=sc.nextInt();
		if(amt>20000)
		{
			throw new InsufficiantFundException("you are trying to withdraw more amount than your account balance ");
			
		}
		else
		{
			System.out.println("you withdrawn your money");
		}
	}
}
class InsufficiantFundException extends Throwable{
	InsufficiantFundException(String str)
	{
		super(str);
	}
}
