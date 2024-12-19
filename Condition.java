package day3;

import java.util.Scanner;

public class Condition {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
	/*	System.out.println("Enter your mark:");
		int mark=sc.nextInt();
		
		if((mark >= 35)&& (mark<=100)) {
			
			 if(mark>=90) {
				 
				 System.out.println("Grade A");
				 
			 }
			 else if(mark>=80) {
				 
					 System.out.println("Grade B");
				 }
			 else {
					System.out.println("Grade C");
				}	
		}
		
		else {
			System.out.println("FAIL");
		} */
	System.out.println("Enter your choice :");
	System.out.println("1 for add :");
	System.out.println("2 for sub:");
	System.out.println("2 for mul:");
	System.out.println("2 for div:");
	System.out.println("2 for mod:");
	 int key=sc.nextInt();
	switch(key) {
	
	case 1:{
		System.out.println("Enter the first number :");
		int firstnum = sc.nextInt();
		System.out.println("Enter the Second number :");
		int secondnum = sc.nextInt();
	
		System.out.println("Addtion is :" +(firstnum+secondnum));
	break;
	}
	case 2:{
		System.out.println("Enter the first number :");
		int firstnum = sc.nextInt();
		System.out.println("Enter the Second number :");
		int secondnum = sc.nextInt();
	
		System.out.println("Subtraction is :" +(firstnum-secondnum));
	break;
	}
	case 3:{
		System.out.println("Enter the first number :");
		int firstnum = sc.nextInt();
		System.out.println("Enter the Second number :");
		int secondnum = sc.nextInt();
	
		System.out.println("Multiplication is :" +(firstnum*secondnum));
	}
	
	case 4:{
		System.out.println("Enter the first number :");
		int firstnum = sc.nextInt();
		System.out.println("Enter the Second number :");
		int secondnum = sc.nextInt();
	
		System.out.println("Division  is :" +(firstnum/secondnum));
	}
	
	
	case 5:{
		System.out.println("Enter the first number :");
		int firstnum = sc.nextInt();
		System.out.println("Enter the Second number :");
		int secondnum = sc.nextInt();
	
		System.out.println("Modulus  is :" +(firstnum%secondnum));
	break;
	}
	default:
	{
	System.out.println("invalid number" );

}
}
}}