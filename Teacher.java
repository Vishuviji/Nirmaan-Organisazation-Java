package school;

public class Teacher {
	 private String name;
	private  int id;
	 private long phoneno;
	private double salary;
	
	public Teacher(String name,int id,long phoneno,double salary) {
		this.name=name;
		this.id=id;
		this.phoneno=phoneno;
		this.salary=salary;
	}
	public Teacher() {
		
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Teacher [name=" + name + ", id=" + id + ", phoneno=" + phoneno + ", salary=" + salary + "]";
	}
	
}
