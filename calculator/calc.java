package interf;

public  class calc implements Calculator {
	@Override
	public void add(int a, int b) {
	System.out.println("Addtion is "+(a+b));
		
	}

	@Override
	public void sub(int a, int b) {
		System.out.println("Subtration is "+(a-b));
		
	}

	@Override
	public void mul(int a, int b) {
		System.out.println("Multiplication is "+(a*b));
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println("Division is "+(a/b));
		
	}

	@Override
	public void mod(int a, int b) {
		System.out.println("Modulus is "+(a%b));
		
	}

	

	

	

}
