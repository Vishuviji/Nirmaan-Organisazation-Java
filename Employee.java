package ClassAndObject;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	


	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}





	@Override
	public boolean equals(Object e) {
		if (this.id == ((Employee) e).id)
			return true;
		
			return false;
	
	}





	@Override
	public int compareTo(Employee o ) {
		if(this.id<o.id) {
			return -1;
		}
			else if (this.id<o.id) {
				return 1;
			}
		
		return 0;
		
	}
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
	//ArrayList<String> al = new ArrayList<String>();
//	al.add("vishnu");
//	al.add("vinay");
//	al.add("vikki");
//	al.add("vishal");
//	System.out.println(al);
			
	/*	TreeSet<Employee> set =new TreeSet<Employee>();
	
	
	Employee emp1 = new Employee(2,"vishnu");
	set.add(emp1);
	Employee emp2 = new Employee(1,"arun");
	set.add(emp2);
	
	Employee emp3 = new Employee(5,"dhruv");
	set.add(emp3);

	Employee emp4 = new Employee(3,"ranav");
	set.add(emp4);
	
	
	System.out.println(set);*/
	
	/*HashSet<Employee> set1 =new HashSet<Employee>();
	
	
	Employee emp5 = new Employee(2,"vishnu");
	set1.add(emp5);
	Employee emp6 = new Employee(1,"arun");
	set1.add(emp6);
	
	Employee emp7 = new Employee(5,"dhruv");
	set1.add(emp7);

	Employee emp8 = new Employee(3,"ranav");
	set1.add(emp8);
	
	
	System.out.println(set1);*/
	
   LinkedHashSet<Employee> set2 =new LinkedHashSet<Employee>();
	
	
	Employee emp9 = new Employee(2,"vishnu");
	set2.add(emp9);
	Employee emp10 = new Employee(1,"arun");
	set2.add(emp10);
	
	Employee emp11 = new Employee(5,"dhruv");
	set2.add(emp11);

	Employee emp12 = new Employee(3,"ranav");
	set2.add(emp12);
	
	
	System.out.println(set2);
	}

}
