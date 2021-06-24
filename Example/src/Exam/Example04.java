package Exam;
import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		/* 키보드에서 두 수를 입력받아, 입력받은 두 수의 최소공배수 구하기.
		   예)2와 5를 입력 : 10 출력
		   	 3과 3을 입력 : 3 출력
		 */
		
		//변수선언
		int n1,n2; //두 수를 입력받을 변수방
		int min=0;	//두 수의 최소공배수를 저장할 변수방
		
		//Scanner 만들기
		Scanner scan=new Scanner(System.in);
		
		//안내문구 입력
		System.out.print("첫번째 수를 입력하세요");
		n1=scan.nextInt();
		
		System.out.print("두번째 수를 입력하세요");
		n2=scan.nextInt();
		
		//최소공배수
		//반복문(for문 안에 if문으로 두 수가 나누어 떨어질때까지 반복하고, 나누어떨어지면 break 걸기)
		/*
		방법 1)
		for (min=1; min<=n1*n2; min++) {
			if(min % n1 == 0 && min % n2 == 0)	//조건을 둘 다 만족해야하기때문에 AND연산 사용(n1과 n2 모두 나눠서 떨어져야하기때문)
				break;
		} */
		
		//방법 2)
		while(true) {	//=무한반복
			min++;
			if(min%n1==0 && min%n2==0)
				break;
		}
		System.out.println(n1+"와(과)"+n2+"의 최소공배수는 "+min+"입니다.");
		
	}

}
