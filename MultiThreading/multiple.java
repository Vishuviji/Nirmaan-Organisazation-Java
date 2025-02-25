package multitask;


class multi {
	public void display() {
		System.out.println(20*3);
	}
}
public class multiple {

	public static void main(String[] args) {
		multi m1 = new multi() {
			public void display() {
				System.out.println(20*30);
			}
		};
		multi m2 = new multi();
		m1.display();
	    m2.display();
	}

}
