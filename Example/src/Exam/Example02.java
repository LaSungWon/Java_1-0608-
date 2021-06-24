package Exam;
import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/* Scanner를 통해 정수 n1, n2을 입력받는다
		   그리고 n1부터 n2까지의 합을 계산하여 그 결과를 출력하시오.
		   ex) scan로 5, 2를 입력 : 2+3+4+5의 출력결과 14을 콘솔에 출력
		 */
		
		//변수 선언
		int n1=0, n2=0;
		int temp;
		int result=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("첫번쨰수를 입력하세요: ");
		n1=scan.nextInt();
		
		System.out.print("두번째수를 입력하세요: ");
		n2=scan.nextInt();
		
		//혹시 큰수가 n1에 입력되면 swap(교체)를 이용하여 작은수가 n1에 오도록 한다.
		if(n1>n2) {
			temp=n1;
			n1=n2;
			n2=temp;
		}
		//for문을 이용하여 합을 구함
		for(int i=n1; i<=n2; i++) {
			result+=i;
		}
		//출력
		System.out.println("결과: "+result);
		
	}

}
