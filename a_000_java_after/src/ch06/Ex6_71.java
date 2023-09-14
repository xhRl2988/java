package ch06;

class Name{
	static void print() { //클래스 메소드
//	void print() { //클래스 메소드

		System.out.println("가능");
	}
	
	void print2() {// 인스턴스 메소드
		System.out.println("쌉가능");
	}
}

public class Ex6_71 {
	public static void main(String[] args) {
		Name.print(); //클래스(static) 메소드는 인스턴스를 생성하지 않아도 호출이 가능
		//Name.print2();
	
		Name name=new Name(); //인스턴스 생성
		name.print2(); // 인스턴스 새성하여야만 호출이 가능
	}
}
