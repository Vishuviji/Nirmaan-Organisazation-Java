package inheritance;

public class UI {
public static void main(String[] args) {
	car d1=new car();
	d1.startEngine();
	d1.drive();
	
	
	ElectricCar e1=new ElectricCar();
	e1.chargeBattery();
	
	bike c1=new bike();
	d1.startEngine();
	c1.kickStart();
}
}
