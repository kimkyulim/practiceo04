package prob01;

import java.util.ArrayList;
import java.util.List;

public class Printer {
	
	//제네릭 메서드
	public <T> void println( T t ) {
		System.out.println( t );
	}
	
	public <T, P, Q> List<P> println( T t, Q q ) {
		System.out.println( t + ":" + q );
		
		List<P> list = new ArrayList<P>();
		return list;
	}
	
	//가변 파라미터 메소드 만들기
	public void println2( String[] params ) {
		for( String s : params ) {
			System.out.print( s + ":" );
		}
		System.out.println( "" );
	}

	public void println3( Object... params ) {
		for( Object s : params ) {
			System.out.print( s + ":" );
		}
		System.out.println( "" );
	}
	
	public void println(int a) {
		
	}
	public void println(boolean b) {
		
	}
	public void println(double c) {
		
	}
	public void println(String d) {
		
	}
	
}
