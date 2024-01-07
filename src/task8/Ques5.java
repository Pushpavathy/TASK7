package task8;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the number");
		int a = sc.nextInt();
		int flag = 0;
		
		
		if (a==0 || a==1)
		{
		System.out.println("Number is not prime");
		}
		
		else {
		
		for (int i =2;i<a;i++)
		{
			if (a%i==0)
			{
				System.out.println("Number is not prime");
				flag = 1;
				 break;
			}
			 
		}

if (flag !=1)
	System.out.println("Number is prime number");
		
	}
}
}

