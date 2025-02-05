package animalbehavior;



public interface animal {
String CATEGORY="Living Being";

static  boolean isMammal(String name) {
	
		return name.equalsIgnoreCase("dog")||name.equalsIgnoreCase("cat");
				}
default void speak() {
	System.out.println("Animal is making a sound.");
}
void move();
void Speak();
}

