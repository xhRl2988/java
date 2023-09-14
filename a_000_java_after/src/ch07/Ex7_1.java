package ch07;
class Tv{ 
	boolean power; 	// 전원상태(on/off)
	int channel;// 채널

	void power()		{power = !power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
}
class SmartTv extends Tv { //CaptionTv는 Tv에 캡션(자막)을 보여주는 기능을 추가
	boolean caption;	//캡션상태(on/off)
	void displayCaption(String text) {
		if (caption) {	//캡션 상태가 on(true)일 때만 text를 보여 준다.
			System.out.println(text);
		}
	}
}
public class Ex7_1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; // 조상 클래스로부터 상속받은 맴버
		stv.channelDown();
//		stv.channelUp(); // 조상 클래스로부터 상속받은 맴버
		System.out.println("채널: "+stv.channel);
		stv.caption = true;
		stv.displayCaption("Hello,Worid 1");
		stv.caption = false;
//		stv.caption = true; // 캡셔(자막) 기능을 켠다
		stv.displayCaption("Hello, Worid 2");
	}
}
