package prob02;

public class Book {
	private int bookNo;//번호
	private String title;//제목
	private String author;//작가
	private int stateCode;//상태코드
	
	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		this.stateCode = 1;
	}
	
	public int getBooNo() {
		return bookNo;
	}
	public void setBooNo(int booNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	
	public void rent() {
		setStateCode(0);
		System.out.println(title+"이 대여되었습니다.");
	}
	
	public void print() {
		System.out.println("책제목 :" + getTitle() + "작가 :" + getAuthor() + "대여 유무:" + (getStateCode() == 1 ? "재고 있음" : "대여중"));
	}
	
}