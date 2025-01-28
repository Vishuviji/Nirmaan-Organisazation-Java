package animal;

class animal{
	public void makeSound() {
		System.out.println("this animal makes a sound");
	}
}
class dog extends animal{
	
	public void makeSound() {
		System.out.println("the dog barks");
	}
}
class cat extends animal{
	public void makeSound() {
		System.out.println("the cat meows");
	}
}
public class makesounds {

	public static void main(String[] args) {
		animal a1=new animal();
		dog d1=new dog();
		cat c1=new cat();
		a1.makeSound();
		d1.makeSound();
		c1.makeSound();
		
	}
}
