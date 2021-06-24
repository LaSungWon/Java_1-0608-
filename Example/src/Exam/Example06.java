package Exam;
import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		/* 키보드에서 수를 입력받아,그 숫자가 소수인지 아닌지 판별하기
		 	소수 : 1과 자신밖에 없는것
		 	예) 1 제외 //7의 약수 : 7, 3의 약수 : 3
		 */
		
		//변수 선언
		int n1=0;
		
		//Scanner
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		n1=scan.nextInt();

		
		//for문 이용
		int i=0;
		for(i=2; i<=n1; i++) {
			if(n1%i==0)
				break;
		}
		
		//for문을 나와서 if문 구현
		if(i==n1) {
			System.out.println(n1+"는(은) 소수 입니다.");
		}else {
			System.out.println(n1+"는(은) 소수가 아닙니다.");
		}
	}	//main
}	//class
