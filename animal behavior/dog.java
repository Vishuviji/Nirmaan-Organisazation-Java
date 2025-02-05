package animalbehavior;

public class dog implements animal{
	public void move() {
		System.out.println("The dog runs on four legs.");
	}

	@Override
	public void Speak() {
	System.out.println( "The dog says: Woof Woof!");
		
	}

}
