package bms;

public class bank {
	private int id=101;
	private String name="Vishnu";
	private double balance=2100;
	private int pin=1999;
	public bank() {
	
	}
	public bank(int id, String name, double balance, int pin) {

		this.id = id;
		this.name = name;
		this.balance = balance;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
