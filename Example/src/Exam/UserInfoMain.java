package Exam;

import java.util.Scanner;

public class UserInfoMain {

	public static void main(String[] args) {
		
		UserInfo ui=new UserInfo();	//객체 생성
		
		int select;	//1입금,2출금 선택...
		int money;	//유저의 돈
		
		outer: while(true) {
			System.out.println("1.입   금");
			System.out.println("2.출   금");
			System.out.println("3.잔액확인");
			System.out.println("4.종   료");
			
			System.out.print("원하시는 작업을 선택하세요: ");
			
			Scanner scan=new Scanner(System.in);
			select=scan.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("---입  금---");
				System.out.print("입금할 금액을 입력하세요: ");
				money=scan.nextInt();
				ui.deposit(money);
				break;
				
			case 2:
				System.out.println("---출  금---");
				System.out.print("출금할 금액을 입력하세요: ");
				money=scan.nextInt();
				ui.withdraw(money);
				break;
				
			case 3:
				System.out.println("---잔 액 확 인---");
				System.out.println(ui.showMoney()+"원 입니다.");
				break;
				
			default:
				System.out.print("종료 합니다.");
				break outer;
			}
			System.out.println("----------------------------");
	}
	}
}
