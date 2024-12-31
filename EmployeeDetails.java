package day8;


public class EmployeeDetails {
	/* String name;
	 int age;
	 String dob;
	 double salary;
	 long phonenumber;
	 String id;
	 public static void main (String []args) {
	EmployeeDetails emp1=new EmployeeDetails();
	emp1.name="vishnu";
	emp1.age=23;
	emp1.dob="28-04-2001";
	emp1.salary=10000;
	emp1.phonenumber=8925210367l;
	emp1.id="vishnu@01";
	System.out.println("emolyee name :"+emp1.name);
	System.out.println("employee age: "+emp1.age);
	System.out.println("employee dob: "+emp1.dob);
	System.out.println("employee salary: "+emp1.salary);
	System.out.println("employee phonenumber: "+emp1.phonenumber);
	System.out.println("employee id: "+emp1.id);
	
	EmployeeDetails emp2=new EmployeeDetails();
	emp2.name="vasu";
	emp2.age=23;
	emp2.dob="28-04-2001";
	emp2.salary=12000;
	emp2.phonenumber=8925210367l;
	emp2.id="vasu@01";
	System.out.println("employee name :"+emp2.name);
	System.out.println("employee age: "+emp2.age);
	System.out.println("employee dob: "+emp2.dob);
	System.out.println("employee salary: "+emp2.salary);
	System.out.println("employee phonenumber: "+emp2.phonenumber);
	System.out.println("employee id: "+emp2.id);
	
	
	EmployeeDetails emp3=new EmployeeDetails();
	emp3.name="vijay";
	emp3.age=23;
	emp3.dob="28-04-2001";
	emp3.salary=10500;
	emp3.phonenumber=8925210367l;
	emp3.id="vijay@01";
	System.out.println("employee name :"+emp3.name);
	System.out.println("employee age: "+emp3.age);
	System.out.println("employee dob: "+emp3.dob);
	System.out.println("employee salary: "+emp3.salary);
	System.out.println("employee phonenumber: "+emp3.phonenumber);
	System.out.println("employee id: "+emp3.id);
	*/
	int firstnum;
	int secondnum;
	
	void Add() {
	System.out.println("Add :"+(firstnum+secondnum) );
}
	void Sub() {
		System.out.println("Sub :"+(firstnum-secondnum) );
	}
	void Mul() {
		System.out.println("Mul :"+(firstnum*secondnum) );
	}
	void Div() {
		System.out.println("Div :"+(firstnum/secondnum) );
	}
	void Mod() {
		System.out.println("Mod:"+(firstnum%secondnum) );
	}
	 public static void main (String []args) {
		 EmployeeDetails Calc1=new EmployeeDetails();
		 Calc1.firstnum=25;
		 Calc1.secondnum=10;
		 Calc1.Add();
		 Calc1.Sub();
		 Calc1.Mul();
		 Calc1.Div();
		 Calc1.Mod();
		 
		 EmployeeDetails Calc2=new EmployeeDetails();
		 Calc2.firstnum=35;
		 Calc2.secondnum=5;
		 Calc2.Add();
		 Calc2.Sub();
		 Calc2.Mul();
		 Calc2.Div();
		 Calc2.Mod();
		 

		 EmployeeDetails Calc3=new EmployeeDetails();
		 Calc3.firstnum=125;
		 Calc3.secondnum=8;
		 Calc3.Add();
		 Calc3.Sub();
		 Calc3.Mul();
		 Calc3.Div();
		 Calc3.Mod();
}
}
