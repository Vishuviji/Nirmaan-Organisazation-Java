package day8;


public class EmployeeDetails {
	 String name;
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
	
}
}