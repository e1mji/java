package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// PDF 9)
		Scanner sc = new Scanner(System.in);
		int kor,eng,mat,sum;
		double avg;
		
		System.out.print("국 영 수 :");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.printf("\n국 %d, 영 %d, 수%d\n",kor,eng,mat);
		System.out.printf("합계:%d(%.1f)\n",sum,avg);
		
		char rank;
		
		if (avg >= 90) { rank = 'A';}
		else if (avg >=80) {rank = 'B';}
		else if (avg >=80) {rank = 'C';}
		else if (avg >=80) {rank = 'D';}
		else 			{rank = 'F';}
		
		System.out.println(rank + "등급입니다~");
		
		sc.close();
	}									

}
