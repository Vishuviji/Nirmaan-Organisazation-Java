package day9;

import java.util.Scanner;

public class MethodEx {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	 Calculator cal1 = new  Calculator();
	System.out.println("Enter your first number : ");
	int a=sc.nextInt();
	System.out.println("Enter your second number : ");
	int b=sc.nextInt();
	System.out.println("Addition is :"+cal1.add(a,b));
	 System.out.println("Subraction is  : " + cal1.sub(a,b));
	 System.out.println("Multiplication  is: " + cal1.Mul(a,b));
	 System.out.println("Divition  is : " + cal1.Div(a,b));
	 System.out.println("Modulus is : " + cal1.Mod(a,b));
}
}

