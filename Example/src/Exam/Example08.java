package Exam;

public class Example08 {

	public static void main(String[] args) {

		int[][]array= {{95,86},{83,92,96},{78,83,93,87,88}};
		
		int sum=0;	//각 항의 합계 구할 방
		double avg=0.0;	//평균 낼 방
		int total=0;	//sum은 초기화 시켜야해서 각 항의 합계를 누적할 방
		int tcount=0;
		
		//outer for문 해당
		int count=0;
		for(int i=0; i<array.length; i++) {	//행 반복(0,1,2)
			//inner for문 해당
			for(int j=0; j<array[i].length; j++) {	//열 반복(2,3,5)
				sum+=array[i][j];
				count++;
		}
		avg=(double)sum/count;
		System.out.println("array배열의 총 합은: "+sum);
		System.out.println("array배열의 평균은: "+avg);
		total+=sum;	//각 항의 모든 합 누적(for문 나와서 각 항의 합과 평균을 출력하기 위하여),((첫번째배열)2+(두번째배열)3+(세번째배열)4=10)
		tcount+=count; 
		sum=0;		//=쓰레기값 비우기, 각 항의 합 누적
		avg=0.0;	//위에서 돌린 데이터가 들어있기 때문에 0으로 초기화 시키고,위로 다시 올라가서 각 문항의 합과 평균을 구함,=쓰레기값 비우기
		count=0;	//=쓰레기값 비우기
		System.out.println("--------------------------------");
	}
	System.out.println("==최종 총합과 평균==");
	double avgf=(double)total/tcount;
	
	System.out.println("sum : "+total);
	System.out.println("avg : "+avgf);
}
}
