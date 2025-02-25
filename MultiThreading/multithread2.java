package multitask;

class class3 implements Runnable {
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("class 1");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class class4 implements Runnable{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("class 2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class multithread2 {

	public static void main(String[] args) {
		class3 c1 = new class3();
		class4 c2= new class4();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		t1.run();
		t2.run();
		

	}

}
