package day15;

import java.util.Scanner;

public class UI1 {
 public static void main(String[] args) {
	 Library book=new  Library();
	 Scanner sc=new Scanner(System.in);
	 boolean iswork=true;
	 while(iswork) {
	 System.out.println("Enter your choice:"); 
	 System.out.println("1 for add book :"); 
	 System.out.println("2 for update book :");
	 System.out.println("3 for show ");
	 
	 int key=sc.nextInt();
     
      if(key==1) {
    	  System.out.println("************************************************************************");
    	 System.out.println("Enter id :");
    	 int id=sc.nextInt();
    	 sc.nextLine();
    	 System.out.println("Enter book name :");
    	 String bookname=sc.nextLine();
    	 
    	 System.out.println("Enter Author:");
    	 String author=sc.nextLine();
    	 System.out.println("Enter book's price :");
    	 double price=sc.nextDouble();
    	 System.out.println("                                                                            ");
    	 System.out.println("Enter book name :"+id);
    	 System.out.println("Enter book name :"+bookname);
    	 System.out.println("Enter Author:"+author);
    	 System.out.println("Enter book's price :"+price);
    	 System.out.println("************************************************************************");
    	 book=new Library(id,bookname,author,price);
     }
      else if(key==2) {
    	
    	  System.out.println("Enter id :");
     	 int id=sc.nextInt();
     	 book.setId(id);
     	 sc.nextLine();
     	 System.out.println("Enter book name :");
     	 String bookname=sc.nextLine();
     	 book.setBookname(bookname);
         
     	 System.out.println("Enter Author:");
     	 String author=sc.nextLine();
     	 book.setAuthor(author);
     	 System.out.println("Enter book's price :");
     	 double price=sc.nextDouble();
     	 book.setPrice(price);
     
     	 System.out.println("Enter id :"+id);
     	 System.out.println("Enter book name :"+bookname);
     	 System.out.println("Enter Author:"+author);
     	 System.out.println("Enter book's price :"+price);
     	 
     	
      }
      
      else if (key==3){
    	 // book=new Library(1,"story of men","andrey",2000);
    	 System.out.println(book);	
    	 
    	 
      }
      else if(key==0) {
    	  iswork=false;
    	  System.out.println("Thank you");
      }
      else {
    	  System.out.println("Enter the current input");
      }
     }
	 
	 
}
}
