package school;

import java.util.Scanner;
public class UI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    student s1 =new student();
    Scanner sc=new Scanner(System.in);
    boolean iswork=true;
    while(iswork) {
    	System.out.println("Enter your choice: ");
    	System.out.println("1 for add student: ");
    	System.out.println("2 for update student:");
    	System.out.println("3 for show ");
    	
    	int key=sc.nextInt();
    	
    	if(key==1) {
    		System.out.println("Enter your name:");
    		String name=sc.next();
    		sc.nextLine();
    		System.out.println("Enter your Rollno: ");
    		int  rollno=sc.nextInt();
    		System.out.println("Enter your Education: ");
    		String Education=sc.next();
    		sc.nextLine();
    		System.out.println("Enter your Phoneno: ");
    		long phoneno=sc.nextLong();
    		
    	}
    	
    	else if(key==2) {
    		System.out.println("Enter your name:");
    		String name=sc.next();
    		sc.nextLine();
    		s1.setName(name);
    		System.out.println("Enter your Rollno: ");
    		int  rollno=sc.nextInt();
    		s1.setRollno(rollno);
    		System.out.println("Enter your Education: ");
    		String Education=sc.next();
    		sc.nextLine();
    		s1.setEducation(Education);
    		System.out.println("Enter your Phoneno: ");
    		long phoneno=sc.nextLong();
    		s1.setPhoneno(phoneno);
    		
    	}
    	else if(key==3) {
    		System.out.println(s1);
    	}
    	
    	else if(key==4) {
    		iswork=false;
    		System.out.println("thank you");
    	}
    	else {
    		System.out.println("Enter the current input");
    	}
    }
    

	}

}
