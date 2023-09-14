package ch06;

class MyMath1{
	long a, b;
	
	//인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
		long add()		{return a+b;}	//a, b는 인스턴스 변수
		long subtract()	{return a-b;}
		long multiply()	{return a*b;}
		double divide()	{return a/b;}
		
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다. a,b는 지역변수
		static long add(long a, long b)			{return a+b+9;}	//a, b는 지역변수
		static long subtract(long a, long b)	{return a-b-9;}
		static long multiply(long a, long b)	{return a*b+9;}
		static double divide(long a, long b)	{return a/(double)b;}
	}

class Ex6_9Test {
	public static void main(String[] args) {
		
		System.out.println("ExTest클래스(static)1: "+MyMath1.add(200L,100L)); 
		//System.out.println("ExTest클래스static)1: +mm1.add(200L,100L)); 
		MyMath1 mm1 = new MyMath1(); //인스턴스 생성
		mm1.a = 300L;
		mm1.b = 100L;
		System.out.println("ExTest인스턴스1        :"+mm1.add());
		System.out.println("ExTest클래스(static)2  :"+mm1.add(200L,10L));
		System.out.println("ExTest인스턴스2        :"+mm1.add());
		
		System.out.println("Ex9클래스(static)1    :"+MyMath2.add(200L, 100L));
		MyMath2 mm2 = new MyMath2();		//인스턴스 생성
		mm2.a = 300L;
		mm2.b = 100L;
		System.out.println("Ex9인스턴스1          :"+mm2.add()); // 인스턴스메서드 호출
		System.out.println("Ex9클래스(static)2    :"+mm2.add(200L,10)); // 인스턴스메서드 호출
		System.out.println("Ex9인스턴스2          :"+mm2.add()); // 인스턴스메서드 호출
		
	}

}
