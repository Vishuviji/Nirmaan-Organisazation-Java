package animalbehavior;

public class bird implements animal{
	public void move() {
		System.out.println("The bird flies in the sky.");
	}

	@Override
	public void Speak() {
		System.out.println("The bird says: Chirp Chirp!");
		
	}

}
