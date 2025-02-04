package interfaceex;

public class Calculator implements calc {

	@Override
	public void mul(int a, int b) {
		System.out.println("multiplication is "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("division is "+(a/b));
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println("addition is "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("subtraction is "+(a-b));
	}
public static void main(String[] args) {
	Calculator c1 = new Calculator();
	c1.add(10, 25);
	c1.sub(10, 5);
	c1.mul(10, 25);
	c1.div(10, 25);
	calc.addition();
	c1.display();
	
}

}
