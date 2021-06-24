package Exam;

public class Example12 {

	public static void main(String[] args) {
		/* 2차원 배열을 만들고 아래와 같이 공간을 채워넣는다ㅏ.
		 	int arr[][] = {1,2,3,4,5};
		 				  {6,7,8,9,10}
						  {11,12,13,14,15}
						  {16,17,18,19,20}
		 2차원 배열 arr에 담긴 모든 값의 총 합과 평균을 구하는 프로그램을 완성해보자
		 */
		int arr[][] = {{1,2,3,4,5},
		  			  {6,7,8,9,10},
		  			  {11,12,13,14,15},
		  			  {16,17,18,19,20}};
		double total=0;
		double average=0;
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				total+=arr[i][j];
				count++;
			}	//inner for문
		}	//outer for문
		average=total/count;
		System.out.println("arr배열의 총합은: "+total);
		System.out.print("arr배열의 평균은: "+average);
		
	}

}
