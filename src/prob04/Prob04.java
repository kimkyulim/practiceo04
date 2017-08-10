package prob04;

public class Prob04 {
	//getinformation을 부르면 부서까지 나오게해야함. 
	//getinformation을 오버라이딩
	//상속했을때 새로 생기는 필드하나를 넣으면 끝 
	public static void main(String[] args) {
		Employee pt = new Depart( "홍길동", 3000, "개발부" );
		pt.getInformation();
	}

}
