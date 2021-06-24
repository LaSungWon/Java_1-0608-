package Exam;
import java.util.Scanner;

public class ScoreavgExample09 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int studentNum=0;
		int[] scores=null;
		double total=0;	//합계
		double avg=0;	//평균
		double max=0;	//최대값
		
		
		Scanner scanner=new Scanner(System.in);
		
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo=Integer.parseInt(scanner.nextLine());	//int지만 nextLine으로 문자 받을 수 있음
			
				if(selectNo==1) {
					System.out.print("학생수>");
					studentNum=Integer.parseInt(scanner.nextLine());	//학생수를 입력받는거(integer로)
																		//키보드로 입력받으니까 scanner
					scores=new int[studentNum];
				} else if(selectNo==2) {
					for(int i=0; i<scores.length;i++) {
						System.out.print("점수입력> ");
						scores[i]=Integer.parseInt(scanner.nextLine());
					}
				} else if(selectNo==3) {
					for(int i=0; i<scores.length;i++) {
						System.out.println("점수리스트> "+scores[i]);
					} 
				}else if(selectNo==4) {	//합계, 평균, 최대값
					for(int i=0; i<scores.length; i++) {
						total+=scores[i];
						if(scores[i]>max) {
							max=scores[i];
						}
					}
					avg=total/scores.length;
					System.out.println("합계는> " +total);
					System.out.println("평균은> " +avg);
					System.out.println("최대값은> " +max);
				}else if(selectNo==5){
					run=false;
					break;
				}
		}
			System.out.println("프로그램 종료");
	}
	}

