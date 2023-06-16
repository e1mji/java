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
			System.out.print(i+1+"��° ���� : ");
			scores[i] = sc.nextInt();
			

			sum += scores[i];
			

			if (max < scores[i]) { max = scores[i];}
			if (min > scores[i]) { min = scores[i];}
		}
		
		avg = sum / (double)scores.length;
		
		System.out.println("\n���� : " + Arrays.toString(scores));
		System.out.printf("�հ� : %d (%.1f)\n",sum,avg);
		System.out.printf("1�� : %d, �õ� : %d\n",max,min);
		

		for (int i =0; i < scores.length -1; i++) {
			for(int j = i + 1; j<scores.length; j++) {
				if (scores[i] > scores[j]) {
					int tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}

		
		System.out.println("\n : " + Arrays.toString(scores));
		
		sc.close();
		
		
		
	}

}
