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
		
		//<설명> :
		/*
		 * scores를 오름차순으로 정렬하는 코드이다 
		 * 선택정렬은 배열을 순회하면서 가장 작은 값을 찾아 첫번째 위치로 옮기고, 
		 * 그다음으로 작은 값을 두번째 위치로 옮기는 과정을 반복하여 정렬을 수행한다.
		 * 위의 구문에서는 이러한 과정을 중첩된 반복문으로 사용하여 수행한다 . 
		 * 바깥쪽 반복문에서 변수i를 0부터  scores 배열의 길이에서 1을 뺀 값까지 증가시킨다
		 * 이는 배열의 모든 요소를 확인하기 위한 반복문이다. 
		 * 조건문을 사용해서 현재 i위치의 요소가 j위치의 요소보다 크다면 두요소의 위치를 교환
		 * 바깥쪽 반복문과 안쪽 반복문을 모두 실행하면서 배열의 모든요소를 확인하고, 가장작은값이
		 * 첫번째 위치로 이동한다. 그다음은 두번째로 작은 값이 두번째 위치로 이동하고,
		 * 이 과정이 반복되며 배열이 정렬된다. 
		 */
		
		
		System.out.println("\n정렬 후 점수 : " + Arrays.toString(scores));
		
		sc.close();
		
		
		
	}

}
