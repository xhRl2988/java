package ch06;
import java.util.Scanner;
class Else {
	  static void Out(){
	        System.err.println("오류 다시 시작");
	    }
}
public class ATM {
	public static void main(String[] args) {

		int m=0;
		int i;
		int j;
		int a=0;
		int b=0;
		
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("메뉴 선택 : 1.입금 2.출금 9.종료");
			i=sc.nextInt();
			if(i==9) {
				System.err.println("장비를 정지합니다.");
				break;
			}else if (i>=10||i==3||i==4||i==5||i==6||i==7||i==8||i==0||i<=0){
				Else.Out();
                continue;
                }
		
		System.out.println("계좌 선택 : 전메뉴 = 0   A = 1   B = 2   종료 = 9");
			j=sc.nextInt();
			if(j==9) {
				System.err.println("장비를 정지합니다.");
				break;
			}else if(j==0) {
				continue;
			}else if(j>=10||j==3||j==4||j==5||j==6||j==7||j==8||i<0){
				Else.Out();
                continue;
                }
		System.out.println("금액 입력 :");
			 m=sc.nextInt();
			 
		if(i==1) {
			if(j==1) {
				a=a+m;
				System.out.println("A잔액 : "+a+" 총금액 : "+(a+b));
				System.out.println("B잔액 : "+b+" 총금액 : "+(a+b));
				System.out.println("총금액 : "+(a+b));
			}else if(j==2) {
				b=b+m;		
				System.out.println("A잔액 : "+a+" 총금액 : "+(a+b));
				System.out.println("B잔액 : "+b+" 총금액 : "+(a+b));
				System.out.println("총금액 : "+(a+b));
			}	
		}else if(i==2) {
			if(j==1) {
				a=a-m;
				System.out.println("A잔액 : "+a+" 총금액 : "+(a+b));
				System.out.println("B잔액 : "+b+" 총금액 : "+(a+b));
				System.out.println("총금액 : "+(a+b));
			}else if(j==2) {
				b=b-m;
				System.out.println("A잔액 : "+a+" 총금액 : "+(a+b));
				System.out.println("B잔액 : "+b+" 총금액 : "+(a+b));
				System.out.println("총금액 : "+(a+b));
				}
			}
		}while(true);	
	}
}