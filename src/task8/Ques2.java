package task8;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		
		int a = sc.nextInt();
		
		if (a%2 == 0)
		{ 
			System.out.print("It is a even number");
		}
		else 
			System.out.print("It is an odd number");
		
	}

}
