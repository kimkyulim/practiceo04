package prob04;

public class Depart extends Employee {
	
	public String department;
	
	public Depart(String string, int i, String string2) {
		System.out.println( "이름:" + string+ "연봉:" + i+"부서 "+string2);
	}

	public void getInformation(String name, int salary, String department) {
		System.out.println( "이름:" + name + "연봉:" + salary +"부서 "+department);
	}

}
