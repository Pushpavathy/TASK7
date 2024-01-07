package task8;

import java.util.Scanner;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a:");
		int a = sc.nextInt();
		System.out.print("Enter the value of b:");
		int b = sc.nextInt();

		int c= a;
		int d = a+b;
		a=d-c;
		b=c;

		System.out.println("Value of a is :" +a);
		System.out.println("Value of b is:"+b);



	}

}
