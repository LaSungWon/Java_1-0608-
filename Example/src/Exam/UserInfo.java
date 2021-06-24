package Exam;

public class UserInfo {
	
		/* UserInfo클래스를 만든 뒤, 금액을 저장할 money라는 변수를 만든다.
		   deposit(int money)메서드를 만들어 유저가 돈을 입금했을 경우를 처리
		   withdraw(int money)메서드를 만들어 유저가 돈을 출금했을 경우를 처리.
		   단, 이 메서드에서는 출금하고자 하는 돈 보다 잔액이 적을경우 잔액이 부족하다는 메세지가 출력 되도록 한다.
		   
		   UserInfo 클래스는 여기까지,
		   Main클래스를 새로 만들어 UserInfo형 객체를 생성한 뒤 아래의 결과가 나오도록 해보자 
		   
		   1.입 금 :
		   2.출 금 :
		   3.잔액확인 :
		   4.종 료 :
		   -- 입  금 --
		   입금할 금액을 입력 : 1000
		   입금성공
		   ---------------------
		   -- 출  금 --
		   출금할 금액을 입력 : 1000
		   출금성공
		   잔액보다 출금이 클 경우 잔액부족
		   */
		
		//필드
		private int money;	//잔액
		
		//입금
		public void deposit(int money) {
			this.money+=money;
			System.out.println("입 금 성 공");
		}
		
		//출금
		public void withdraw(int money) {
			
			if(this.money-money<0) {
				System.out.println("잔 액 부 족");
			}else {
				this.money-=money;
				System.out.println("출 금 성 공");
			}
		}
		
		//리턴 메서드
		public int showMoney() {
			return money;
		}
		
		
		//private money get,set
		public int getMoney() {
			return money;
		}

		public void setMoney(int money) {
			this.money = money;
		}
		
		
		
		
	}

