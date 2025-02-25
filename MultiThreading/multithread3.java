package multitask;

class classA  {
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("class A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class classB {
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("class B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class multithread3 {

	public static void main(String[] args) {
		classA c1 = new classA();
		classB c2= new classB();
		Thread t1 = new Thread() {
			public void run() {
				c1.display();
			}
		};
				
		Thread t2 = new Thread() {
			public void run() {
				c2.display();
			}
		};
			
		
		t1.start();
		t2.start();
	}
	

}
