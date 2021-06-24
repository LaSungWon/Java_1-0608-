package Exam;
import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		/*
		 학생들의 수학과 영어성적을 등록하는 프로그램이 있다.
		 프로그램을 실행하면 몇 명의 정보를 저장할 것인지를 입력받은 후,
		 입력받은 수만큼 학생들이 이름과 수학성적, 영어성적을 입력받는 프로그램 작성
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("등록할 인원수");
		int n=scan.nextInt();
		String str[][]=new String[n][3];
		
		//n명만큼 정보입력
		for(int i=0; i<str.length; i++) {
			for(int j=0; i<str.length; j++) {
				System.out.print("이름: ");
				str[i][j]=scan.next();
				j++;
				System.out.print("수학점수: ");
				n=scan.nextInt();
				j++;
				System.out.println("영어점수: ");
				n=scan.nextInt();
			}
			System.out.println("---------------------------");
		}
		System.out.println(str.length+"명만큼 등록 완료 되었습니다.");
		for(int i=0; i<str.length; i++) {
		for(int j=0; j<str.length; j++) {
			System.out.print(str[i][j]+"/ ");
		}
		}
		System.out.println();
	}
}
