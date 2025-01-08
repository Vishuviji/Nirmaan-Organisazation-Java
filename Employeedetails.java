package day13;

class employee{
	private String employeename;
	 private String employeeid;
	 private long phoneno;
	 private double salary;

public void setEmployeeName(String employeename) {
	this.employeename= employeename;
}
public String getEmployeeName() {
	return employeename;
}
public void setEmployeeId(String employeeid) {
	this.employeeid= employeeid;
}
public String getEmployeeId() {
	return employeeid;
}
public void setPhoneNo(long phoneno) {
	this.phoneno= phoneno;
}
public long getPhoneNo() {
	return phoneno;
}
public void setSalary(double salary) {
	this.salary= salary;
}
public double getSalary() {
	return salary;
}
	public String toString() {
    return "Employee Name :"+employeename+ "\nEmployee Id: "+employeeid+"\nPhone No: "+phoneno+"\nSalary: "+salary;
}
}
public class Employeedetails {
	public static void main(String[] args) {
		 employee emp1= new employee();
		 emp1.setEmployeeName("vishnu");
		 emp1.setEmployeeId("vishnu123");
		 emp1.setPhoneNo(8925210367l);
		 emp1.setSalary(15000);
		 System.out.println(emp1);
	
		 employee emp2= new employee();
		 emp2.setEmployeeName("vijay");
		 emp2.setEmployeeId("vijay123");
		 emp2.setPhoneNo(8925210467l);
		 emp2.setSalary(15300);
		 System.out.println(emp2);
		 
		 employee emp3= new employee();
		 emp3.setEmployeeName("vishal");
		 emp3.setEmployeeId("vishal323");
		 emp3.setPhoneNo(8925213278l);
		 emp3.setSalary(15600);
		 System.out.println(emp3);
		 
		 employee emp4= new employee();
		 emp4.setEmployeeName("vishwa");
		 emp4.setEmployeeId("vishwa456");
		 emp4.setPhoneNo(89252102345l);
		 emp4.setSalary(12340);
		 System.out.println(emp4);
}
}
