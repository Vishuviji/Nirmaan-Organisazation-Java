package library_management;


import java.util.Scanner;
import java.util.ArrayList;


public class Userinterface {

	

	public static void main(String[] args) {
		BOOK book =new BOOK();
		Scanner sc = new Scanner(System.in);
		ArrayList<BOOK> bk = new  ArrayList<BOOK>();
		boolean iswork=true;
		
		while(true) {
			System.out.println("1 for add");
			System.out.println("2 for show" );
			System.out.println("3 for update" );
			System.out.println("4 for remove" );
			System.out.println("5 for get");
			System.out.println("0 for exit");
			
			int key=sc.nextInt() ;
			if(key==1) {
				System.out.println("Enter the id:");
				int id=sc.nextInt();
				sc.nextLine();
				

				System.out.println("Enter the book name:");
				String name=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter the book Author:");
				String author=sc.nextLine();
				sc.nextLine();
				
				System.out.println("Enter the book price:");
				double price=sc.nextDouble();
				sc.nextLine();
				
				bk.add(book =new BOOK(id,name,author,price));
				
				
			
			}
			else if(key==2){
				System.out.println(book);
				
			}
            else if(key==3){
            	
            	System.out.println("Enter the id:");
				int id=sc.nextInt();
				sc.nextLine();
				
				boolean isThere=false;
				for(BOOK bks:bk) {
					if(bks.getId()==id) {
						
						
						System.out.println("Enter the book ");
						String name=sc.nextLine();
						bks.setName(name);
						
						System.out.println("Enter the book Author:");
						String author=sc.nextLine();
						bks.setAuthor(author);
						
						System.out.println("Enter the book price:");
						double price=sc.nextDouble();
						bks.setPrice(price);
						
						isThere = true;
					}
						
			}
				if(!isThere) {
					System.out.println("not there");
				}	
			}
            else if(key==4){
            	System.out.println("Enter the id:");
				int id=sc.nextInt();
				
				boolean isThere=false;
				
				for(BOOK bks1:bk) {
					
					if(id==bks1.getId()) {
						
						isThere = true;
					bk.remove(bks1);
					System.out.println("id is remove");
					break;
					}
				}
					
					
					
				if(!isThere) {
						System.out.println("not there");
					}
				
			}
            else if(key==5) {
            	System.out.println(book);
            }
            else if(key==0) {
            	
             boolean istrue=false;
            	System.out.println("program end");
            }
            	
            }
			
            }
		
	
}


		
		
		
		
		
		
		
		
		
	

	

