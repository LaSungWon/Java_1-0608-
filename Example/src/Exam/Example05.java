package Exam;
import java.util.Scanner;
public class Example05 {

	public static void main(String[] args) {
		/* 키보드에서 두 수를 입력받아, 입력받은 두 수의 최대공약수 구하기.
		   예)10와 4를 입력 : 2 출력,
		   예)3과 7같은 소수 제외?
		 */
		
		//변수
		int n1,n2;	//두 수를 입력받을 변수방
		int max=0;	//두 수의 최대공약수를 담을 변수방
		int temp=0; //두 수를 비교하여 큰수부터 뽑기 위한 변수방(↙모양으로 이동하는거)
		
		//두 수 scan
		Scanner scan=new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요");
		n1=scan.nextInt();
		
		System.out.println("두번째 수를 입력하세요");
		n2=scan.nextInt();
		
		///두 수중에 작은 수를 추출
		if(n1>=n2)
			temp=n2;
		else
			temp=n1;
		
		//for문(작은수 ; 1보다 작거나 같을때까지; i--
		int i;
		for(i=temp; i>=1; i--) {
			if(n1%i==0 && n2%i==0) {
				break;
			}	//if
		}	//for
		//출력
		if(i==1) {
			System.out.println("최대공약수가 없습니다.");
		}else {
			System.out.println((n1+"과(와)"+n2+"의 최대공약수는 "+i+"입니다"));
		}	//if
	}	//main
}	//class
