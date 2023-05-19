package array;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		//PDF 6p)
		int n =5, sum=0, max =0, min = 99999;
		int[] scores = new int[n];
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i <scores.length; i++) {
			System.out.print(i+1+"번째 점수 : ");
			scores[i] = sc.nextInt();
			
			// 합계
			sum += scores[i];
			
			//최대/최소
			if (max < scores[i]) { max = scores[i];}
			if (min > scores[i]) { min = scores[i];}
		}
		
		avg = sum / (double)scores.length;
		
		System.out.println("\n점수 : " + Arrays.toString(scores));
		System.out.printf("합계 : %d (%.1f)\n",sum,avg);
		System.out.printf("1등 : %d, 꼴등 : %d\n",max,min);
		
		// 선택정렬
		for (int i =0; i < scores.length -1; i++) {
			for(int j = i + 1; j<scores.length; j++) {
				if (scores[i] > scores[j]) {
					int tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		
		System.out.println("\n정렬 후 점수 : " + Arrays.toString(scores));
		
		sc.close();
		
		
		
	}

}
