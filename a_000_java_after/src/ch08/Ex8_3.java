package ch08;

public class Ex8_3 {
	public static void main(String[] args) {
		System.out.println(1+" try블럭문 전");
		System.out.println(2+" try블럭문 전");
			
		try {
			System.out.println(3+" try블럭문");
			System.out.println(0/0+" try블럭문 0/0실행");
			System.out.println(4+ " try블럭문");	//실행되지 않는다.
		}catch (ArithmeticException e){	//ArithmeticExceprion대신Exception을 사용.
			System.out.println(5+" catch블럭문 ArithmeticException e");
		}catch (Exception e){			//ArithmeticExceprion대신Exception을 사용.
			System.out.println(51+" catch블럭문 Exception e");
		}	//try-catch의 끝
		System.out.println(6+" try블럭문 끝");
		System.out.println("프로그램은 정상 종료되었습니다");
	}	//main메서드의 끝
}
