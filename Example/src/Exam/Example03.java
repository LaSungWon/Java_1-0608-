package Exam;
import java.util.Random;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {{
		// 예) 컴퓨터가 가지고 있는 수 : 4,1,6
		//1~9 사이의 수를 입력하세요:
		/* 
		 첫번째 수를 입력하세요 : 4
		 두번째 수를 입력하세요 : 5
		 세번째 수를 입력하세요 : 6
		 [2]Strike, [1]Ball
		 
		 첫번째 수를 입력하세요 : 7
		 두번째 수를 입력하세요 : 8
		 세번째 수를 입력하세요 : 9
		 OUT!!
		 
		 첫번째 수를 입력하세요 : 1	(4)
		 두번째 수를 입력하세요 : 6	(1)
		 세번째 수를 입력하세요 : 5	(6)	//순서가 틀렸을떄(숫자는 맞지만)
		 [0]Strike, [2]Ball
		 
		 첫번째 수를 입력하세요 : 4
		 두번째 수를 입력하세요 : 1
		 세번째 수를 입력하세요 : 6
		 Win!!
		 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		//컴퓨터가 발생할 난수
		int com1=0;
		int com2=0;
		int com3=0;		//컴퓨터가 각 숫자를 받을 변수방 선언
		
		//1에서 9까지의 난수 발생(Computer)
		//컴퓨터의 자료 준비
		do {
		com1=new Random().nextInt(9)+1;
		com2=new Random().nextInt(9)+1;
		com3=new Random().nextInt(9)+1;	//do에서 컴퓨터가 렌덤으로 숫자 하나씩 뽑음
		
		}while(com1==com2 || com1==com3 || com2==com3);
		
		//사용자가 입력할 숫자, 변수방 선언
		
		int user1=0;
		int user2=0;
		int user3=0;
		
			while(true) {
				System.out.print("1~9사이의 수를 입력하세요");
				System.out.print("첫번쨰 수를 입력하세요");
				user1=scan.nextInt(); //사용자의 수를 입력 받는다	//숫자로 받으니까 nextInt로 받음 
				
				System.out.print("두번쨰 수를 입력하세요");
				user2=scan.nextInt(); //사용자의 수를 입력 받는다
				
				System.out.print("세번쨰 수를 입력하세요");
				user3=scan.nextInt(); //사용자의 수를 입력 받는다
				
				int strike=0;
				int ball=0;	//strike와 ball 개수를 세어줄 변수방 선언
				
				//만약에 사용자가 입력한 첫번째 play 숫자와 com1이랑 같으면 : strike 1점 획득
					if(user1==com1) {
						strike++;
					}
					//기준(user1) 숫자는 맞지만 자리수가 다를 경우 ball로 판정 : ball 1점 획득
					else if(user1==com2 || user1==com3)
							ball++;
					//=====================================
					
					//만약에 사용자가 입력한 두번째 play 숫자와 com2가 같으면 : strike 1점 획득
					if(user2==com2) {
						strike++;	//++strike는 안됨 맞던 안맞던 더하고 시작하기때문
					}
					//기준(user2) 숫자는 맞지만 자리수가 다를 경우 ball로 판정 : ball 1점 획득
					else if(user2==com1 || user2==com3) 
						ball++;
					//=====================================
					
					//만약에 사용자가 입력한 두번째 play 숫자와 com3가 같으면 : strike 1점 획득
					if(user3==com3) {
						strike++;
					}
					//기준(user2) 숫자는 맞지만 자리수가 다를 경우 ball로 판정 : ball 1점 획득
					else if(user3==com1 || user3==com2)
						ball++;
					//=====================================
					//strike 3점이면 WIN!!출력후 종료
					if (strike == 3) {
						System.out.print("WIN!!!"+com1+com2+com3);
						break;
					}
					//strike 0  ball 0 OUT!!
					else {
						if((strike>0)||(ball>0)) {
							System.out.println(strike+"Strike " + ball+"Ball");
						}
						else //strike, ball 둘 다 아무것도 못맞췄을경우
							System.out.println("OUT!!");
					}
				}	//if문
			}	//while문(true)
	}	//main
}	//class
