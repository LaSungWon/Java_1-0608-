package Exam;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력받은 문자열에 소문자 a가 몇개 있는지 판별하는 로직을 구현해보시오.
		//예) 문자입력>aslkfjsdkl
		//	 a의 개수는 : 1개 입니다.
		
		String str;
		int count=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("숫자와 특수문자를 제외한 아무 문자를 입력하시오");
		str=scan.next();	//문자(char)의 배열 = String
		
		//입력	//for문	//if문
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') { //str.charAt(i)=='a'; -->count를 돌려서 ASCII코드 값 97=a니까 이렇게 a를 찾으려고
				count++;
			}
		}
		System.out.println("a의 개수는: "+count+"개 입니다.");
		
	}

}
