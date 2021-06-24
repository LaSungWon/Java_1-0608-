package Exam;
import java.util.Scanner;

public class Example13Main {

	public static void main(String[] args) {
		Example13 ws=new Example13();
		
		String answer=ws.getAnswer();	//정답 반환 메서드 호출(answer=컴퓨터가 갖고있는거)
		
		String question = ws.getScrambleWord(answer);	//가져온 단어를 섞어서 변수방에 담음, 즉 문제가 생성됨
		
		System.out.println("문제: " + question); //섞여진 단어 출력
		
		while(true) {
			System.out.print("단어: ");
			Scanner scan=new Scanner(System.in);
			String str=scan.next();
			
			if(str.equalsIgnoreCase(answer)) {	//equalsIgnoreCase : 대소문자 구분하지않고 맞냐고 물어보는거
				System.out.println(str+"정답!!");
				break;
			}else {
				System.out.println(str+"오답..ㅠㅠ");
			}
		}
	}

}
 