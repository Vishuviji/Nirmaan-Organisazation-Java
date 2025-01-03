package day10;

public class ConstructorEX {
	  int carid;
	  String carname;
	  double price;
	  
	  ConstructorEX  (int id, String nameOfCar,double amount){
		this.carid=id;
		carname =nameOfCar;
		price=amount;
	}
	  ConstructorEX(){
	  
	  }
public static void main(String[] args) {
	 ConstructorEX Car1 = new  ConstructorEX(1004,"BMW",100000);
	 System.out.println("Car id:"+Car1.carid);
	 System.out.println("Car name:"+Car1.carname);
	 System.out.println("Car price:"+Car1.price);
	 ConstructorEX Car2 = new  ConstructorEX();
	 Car2.carid=1005;
	 Car2.carname="rolex";
	 Car2.price=200000;
	 System.out.println("Car id:"+Car2.carid);
	 System.out.println("Car name:"+Car2.carname);
	 System.out.println("Car price:"+Car2.price);
}
}