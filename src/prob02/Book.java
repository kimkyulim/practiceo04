package prob02;

public class Book {
	private int Bookno;
	private String booktitle;
	private String author;
	private int stateCode;
	
	
	public int getBookno() {
		return Bookno;
	}
	public void setBookno(int bookno) {
		Bookno = bookno;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	//메서드들 
	public Book(int bookNO, String title, String author) {
		
	}
	public void rent() {
		if(stateCode==0) {
			System.out.println(booktitle+"이(가) 대여 됐습니다.");
		}
		
	}
	public void print() {
		
	}
	public int getBookNo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}