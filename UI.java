package day14;

public class UI {

	

	public static void main(String[] args) {
		library book=new library();
		book.setId(1234);
		book.setBookname("java");
		book.setAuthor("JAMES");
	    book.setPrice(500);
	    System.out.println("........Library  Details....");
		System.out.println("                                ");
		System.out.println("id:"+book.getId());
		System.out.println("Book name:"+book.getBookname());
		System.out.println("Author:"+book.getAuthor());
		System.out.println("price:"+book.getPrice());
		System.out.println("                                ");
		
		library book1=new library(123,"story of men","andery",600);
		System.out.println(book1);
	}

}
