package Exam;
import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		/* Scanner를 통해 정수 n을 입력받는다
		   그리고 1부터 입력받은 정수 n까지의 합을 계산하여 그 결과를 출력하시오.
		   ex) scan로 5를 입력 : 1 + 2 + 3 + 4 + 5 = 15
		 */
		
		System.out.print("숫자를 입력하세요: ");
		Scanner scan=new Scanner(System.in);	//System.in -> Scanner가 가지고 있는 기능을 사용하여 입력받음,입력장치 생성
		int n=scan.nextInt();	//정수를 받을거니까 scan.nextInt로 받고
		
		int result=0;	//합계 누적할 변수방
		
		for(int i=1; i<=n;i++) {	//i는 1부텃 시작하여 내가 입력한 n의 값까지 1씩 증가하면서 돈다
			result += i;	//= result=result+i --> result에 i의 값 누적합산
		}
		
		System.out.println("결과: " +result+" 입니다.");	//i의 값 누적합산한 값 출력
		
	}

}
