package ch08;

public class Ex8_1v1 {
	public static void main(String[] args) {
		System.out.println(1+" try블럭문 전");

			System.out.println(2+" try블럭문");
			System.out.println(3+"test"+0/0);
			
			System.out.println(4+" catch블럭문 Exception e"); //실행되지 않는다

			System.out.println(5+" try블럭문 끝~~");
	}
}
