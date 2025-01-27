package school;

public class student {

	private String name;
	private int rollno;
	private String Education;
	private long phoneno ;
	
	public student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getEducation() {
		return Education;
	}

	public void setEducation(String education) {
		Education = education;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", rollno=" + rollno + ", Education=" + Education + ", phoneno=" + phoneno
				+ "]";
	}

	
}
