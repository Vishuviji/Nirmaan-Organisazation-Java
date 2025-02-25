package multitask;
class classC  {
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("class C");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class classD {
	public void display() {
		for(int i=0;i<=100;i++) {
			System.out.println("class D");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class multitask4 {
	public static void main(String[] args) {
		classC c1 = new classC();
		classD c2= new classD();
		
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				c1.display();
			}
		};
				
		Runnable r2 = new Runnable() {
			@Override
			public void run() {
				c2.display();
			}
		};
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		
		t3.start();
		t4.start();
	}
	
}
