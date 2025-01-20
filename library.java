package day14;

public class library {

	private int id;
	private String bookname;
	private String author;
	private int price;
	
	public library(int id,String bookname,String author,int price) {
		this.id=id;
		this.bookname=bookname;
		this.author=author;
		this.price=price;
		
		
	}
	public library() {
	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
	    return "id:"+id+" \nBook name:"+bookname+"\nAuthor:"+author+"\nprice:"+price;
	}

}
