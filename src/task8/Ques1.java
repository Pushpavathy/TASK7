package task8;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		System.out.print("Enter the value of a :");

		int a = sc.nextInt();

		System.out.print("Enter the value of b :");

		int b = sc.nextInt();

		System.out.print("Enter the value of c :");

		int c = sc.nextInt();

		System.out.print("Enter the value of d :");

		int d = sc.nextInt();

		int sum = a+b;

		int sum2 = c+d;

		if (sum > sum2)

		{
			System.out.println("sum of a and b is greater than sum of c and d");

		}
		else 
			System.out.println("sum of c and d is greater than sum of  a and b");
	}

}

