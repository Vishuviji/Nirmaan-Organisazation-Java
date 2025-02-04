package interfaceex;
interface calc2{
	void mul(int a,int b);
	void div(int a,int b);
}
public interface calc extends calc2 {
	void add(int a,int b);
	void sub(int a,int b);
	
	static void addition() {
		System.out.println(10+10);
	}
 default void display() {
	 System.out.println("this is a default ");
	 
 }
}
