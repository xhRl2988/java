package ch06;

class Card{
	String kind;				//인스턴스 변수
	int number;					//인스턴스 변수
	static int width =100;		//클래스 변수
	static int height =250;		//클래스 변수

}

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.whidth= "+Card.width);
		System.out.println("Card.height= "+Card.height);
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=4;
		
		Card c3=new Card();
		c3.kind="Club";
		c3.number=11;
		
		Card c4=new Card();
		c4.kind="Spade";
		c4.number=12;
		
		System.out.println("c1은 "+c1.kind+","+c1.number+"이며, 크기는("+c1.width+","+c1.height+")");
		System.out.println("c2은 "+c2.kind+","+c2.number+"이며, 크기는("+c2.width+","+c2.height+")");
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
		c1.width=50;			//c1.width = c2.width 		static을 붙여서 width를 공유함
		c1.height=80;			//c1.height = c2.height 	static을 붙여서 height를 공유함
		
		System.out.println("c1은 " + c1.kind + "," + c1.number + "이며,크기는 (" + c1.width + "," + c1.height + ")");
		System.out.println("c2은 " + c2.kind + "," + c2.number + "이며,크기는 (" + c2.width + "," + c2.height + ")");
		
		c3.width=100;			//c1.width = c2.width 		static을 붙여서 width를 공유함
		c4.height=250;
		
		System.out.println("c3은 "+c3.kind+","+c3.number+"이며, 크기는("+Card.width+","+Card.height+")");
		System.out.println("c4은 "+c4.kind+","+c4.number+"이며, 크기는("+Card.width+","+Card.height+")");
	}
}
