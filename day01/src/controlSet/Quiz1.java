package controlSet;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// PDF 9)
		Scanner sc = new Scanner(System.in);
		int kor,eng,mat,sum;
		double avg;
		
		System.out.print("�� �� �� :");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		avg = sum / 3.0;
		
		System.out.printf("\n�� %d, �� %d, ��%d\n",kor,eng,mat);
		System.out.printf("�հ�:%d(%.1f)\n",sum,avg);
		
		char rank;
		
		if (avg >= 90) { rank = 'A';}
		else if (avg >=80) {rank = 'B';}
		else if (avg >=80) {rank = 'C';}
		else if (avg >=80) {rank = 'D';}
		else 			{rank = 'F';}
		
		System.out.println(rank + "����Դϴ�~");
		
		sc.close();
	}									

}
