package task8;

import java.util.Scanner;

public class Ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value");
		
		int a= sc.nextInt();
		int factor =1;
		
		
		for (int i=1;i<=a;i++)
		{
			
				factor = factor*i;			
		}
		System.out.println("Factorial of" +a+ "is:" +factor);
	}
	

}
