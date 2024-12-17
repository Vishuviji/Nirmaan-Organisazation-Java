package day3;

public class Operators {
	public static void main(String[] args) {
// Arithmetic Operator
		int a=12;
		int b=25;
	
	int c= a+b;
	int d=a-b;
	int e= a*b;
	int f= a/b;
	int g= a%b;
	System.out.println("Arithmetic Operators:");
	System.out.println("Addition is " + (c));
	

	System.out.println("Subraction is " +  (d));
	System.out.println("Multiplication is " + e);
	System.out.println("Division is " + f);
	System.out.println("Modulus is " + g);
	
	
	// Relational Operator
	System.out.println("Relational Operators:");
	System.out.println("12>25 : " +(a>b));
	System.out.println("12<25 : " +(a<b));
	System.out.println("12<=25 : " +(a<=b));
	System.out.println("12>=25 : " +(a>=b));
	System.out.println("12==25 : " +(a==b));
	System.out.println("12!=25 : " +(a!=b));
	
	// Logical Operator
	int j=50;
	int k=100;
	int l=5;
	int m=10;
	System.out.println("Logical Operators:");
	System.out.println("12>10 AND 25<50 : " +((a>m)&&(b<j)));
	System.out.println("12<5 OR 25>100 : " +((a<l)||(a>k)));
	
	// Assignment Operator
	int h=10;
	System.out.println("Assignment Operators:");
	System.out.println("initial value is "+h);
	System.out.println("After += : "+ (a+=h));
	System.out.println("After -= : "+ (a-=12));
	System.out.println("After *= : "+ (a*=h));
	System.out.println("After /= : "+ (a/=h));
	System.out.println("After += : "+ (a%=h));

	// Unary Operator
	int i=12;
	System.out.println("Unary Operators:");
	System.out.println("initial value is "+i);
	System.out.println("After increment : "+ (++i));
	System.out.println("After decrement : "+ (--i));
	
	// conditional Operator
	System.out.println("Conditional Operators:");
	  int  n=11;
  String even=(a<n)? "12 is even" : " 11 is odd";
 System.out.println(  even );
}}
