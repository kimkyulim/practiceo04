package prob05;

public class MyBase extends Base {

	@Override
	public void service(String state) {
		
		if("오후".equals(state)) {
			night1();
			return;
		}
		super.service(state);
		
	}

	@Override
	public void day() {
		System.out.println("낮에는 열심히 일하자!");
		/*super.day();*/
	}

	public void night1(){
		System.out.println("오후도 낮과 마찬가지로 일해야합니다.");
	}
	
	

}