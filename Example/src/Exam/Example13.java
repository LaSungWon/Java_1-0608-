package Exam;
import java.util.Random;

public class Example13 {
	/*	String[] strArr={"CHANGE","LOVE","HOPE","IEW","APPLE");
	 WordScramble클래스를 만들어 위와같은 배열을 선언하고 이를 이용하여 
	 WordScrambleMain클래스에서 실행했을때 아래의 결과가 출력되게 해보자
	 실행결과:
	 문제:PEALP
	 ealpp오답....
	 단어는? apple
	 apple 정답!!
	*/
	//====================================================
	
	String[] strArr={"CHANGE","LOVE","HOPE","IEW","APPLE"};
	String shake="";
	
	//정답 반환
	public String getAnswer() {
		
		int idx=new Random().nextInt(strArr.length);
		return strArr[idx];
	}
	
	//문제를 섞어서 반환하는 메소드
	public String getScrambleWord(String str) {
		//정답 단어를 문자 단위로 끊어서 저장
		//int형 배열 생성
		int[] inArr=new int[strArr.length];
		
		//만들어진 inArr배열의 각 방에 겹치지 않도록 처리한 난수를 입력
		for(int i=0; i<inArr.length;) {
			inArr[i]=new Random().nextInt(str.length());	//h o p e -->str[0]로 인식
			boolean check=false;	//아무것도 판단할게 없으니까 일단 불 꺼놓은 상태
			
			for(int j=0; j<i; j++) {	//중복성 제거
				if(inArr[i]==inArr[j]) {
					check=true;
					break;
				}
			}
			if(!check){	//inArr배열안에 중복이 없을때 check=false, 중복이 되지 않으면 i 증가
				i++;	//for문에서 증가값을 단어가 같지 않을때 증가시킴
			}
		}//outer for문, i++생략
		
		for(int i=0; i<str.length(); i++) {
			//str을 문자단위로 분리
			//위의 코드에서 발생시킨 난수의 순서대로 shake변수에 추가
			shake+=str.charAt(inArr[i]);
		}
		return shake;
		
	}
	
	
}

