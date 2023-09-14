package ch06;

class TestClass{
	int iv_num; // 인스턴스 변수
	static int cv_num; // static 변수
	
	void sungilClass20() {
		System.out.println("sugilClass20 메소드에 클래스 변수 출력 :"+cv_num);
	}
	
	int sungilClass22(int num) { // 인스턴스 메서드
		int resurt = num * 10;
		if(resurt > 200) {
			resurt = resurt - 200;
		}
		return resurt;
	};
	String sungilClass24(int num) {
		sungilClass20(); // 인스턴스 메소드에서 인스턴스 메소드 호출
		
		cv_num = 11;
		appPro20(); // 인스턴스 메소드에서 static 메소드 호출
		
		cv_num = sungilClass22(num); 
		String resurt = "sungilClass24 메소드에 클래스 변수 출력 : "+num;
		if (cv_num > 50) {
			resurt = "sungilClass24 메소드에 클래스 변수 출력1:"+(cv_num - 50);			
		}
		return resurt;
	};
	void sungilClass29(String str) {
		System.out.println("sungilClass29 메소드에 클래스 변수 출력 :"+str);
	}
	static void appPro20() { // static 메서드
		System.out.println("appPro20 static void 메서드 :"+cv_num);
	};
	
	static int appPro22(int num) { // static 메서드에서도
		//sungilClass20(); // static 메소드에서 인스턴스 메소드 호출 안된다.
		cv_num =22 +num;
		appPro20(); // static 메서드는 호출 할 수 있다
		return 100;
	}
	
	static String appPro24(int num) { // static 메서드에서도
		// sungilClass20(); // static 메소드에서 인스턴스 메소드 호출 안된다.
		appPro20();
		
		cv_num = appPro22(num);
		String result = "appPro24 static 리턴str 메서드 :"+cv_num;
		if(num <10) {
			result = "appPro24 static 리턴str 메서드10:"+TestClass.cv_num;
		}
		return result;
	}
}
public class Ex6_9TestClass {
	public static void main(String[] args) {
		TestClass t1 = new TestClass();
		TestClass t2 = new TestClass();
		
		t1.cv_num = 7;
		String m_str1 = t1.sungilClass24(t1.cv_num);
		System.out.println(m_str1);
		System.out.println("-------------------------------------");
		
		String m_str2 = t2.sungilClass24(t2.cv_num);
		System.out.println(m_str2);
		System.out.println("-------------------------------------");
		
		m_str1 = t1.appPro24(t1.cv_num);
		System.out.println(m_str1);
}
}
