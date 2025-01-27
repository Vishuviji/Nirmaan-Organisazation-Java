package school;

import java.util.Scanner;

public class UI2 {

	public static void main(String[] args) {
		
		 Teacher t1 =new Teacher();
		    Scanner sc=new Scanner(System.in);
		    boolean iswork=true;
		    while(iswork) {
		    	System.out.println("Enter your choice: ");
		    	System.out.println("1 for add teacher: ");
		    	System.out.println("2 for update teacher:");
		    	System.out.println("3 for show ");
		    	
		    	int key=sc.nextInt();
		    	
		    	
		    	switch(key) {
		    	
		    	
		    	case 1 :
		    	{
		    		System.out.println("Enter your name:");
		    		String name=sc.next();
		    		sc.nextLine();
		    		
		    		System.out.println("Enter your id: ");
		    		int  id=sc.nextInt();
		    		
		    	
		    		System.out.println("Enter your Phoneno: ");
		    		long phoneno=sc.nextLong();
		    		
		    		System.out.println("Enter your Salary: ");
		    		double salary=sc.nextDouble();
		    		sc.nextLine();
		    		
		    		 t1 = new Teacher(name,id,phoneno,salary);
		    		
		    		break;
		    	}
		    	
		    	case 2: {
		    		System.out.println("Enter your name:");
		    		String name=sc.next();
		    		sc.nextLine();
		    		t1.setName(name);
		    		
		    		System.out.println("Enter your id: ");
		    		int  id=sc.nextInt();
		    		t1.setId(id);
		    		
		    		System.out.println("Enter your Salary: ");
		    		double salary =sc.nextDouble();
		    		sc.nextLine();
		    		t1.setSalary(salary);
		    		
		    		System.out.println("Enter your Phoneno: ");
		    		long phoneno=sc.nextLong();
		    		t1.setPhoneno(phoneno);
		    		
		    		break;
		    	}
		    	case 3:
		    	{
		    		System.out.println(t1);
		    		break;
		    	}
		    	
		    	case 4:
		    	{
		    		iswork=false;
		    		System.out.println("thank you");
		    		break;
		    	}
		    	case 5:
		    	
		    	{
		    		System.out.println("Enter the current input");
		    	}
		    }
		    
		    }
	}
}
			

	


