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
			
			// �հ�
			sum += scores[i];
			
			//�ִ�/�ּ�
			if (max < scores[i]) { max = scores[i];}
			if (min > scores[i]) { min = scores[i];}
		}
		
		avg = sum / (double)scores.length;
		
		System.out.println("\n���� : " + Arrays.toString(scores));
		System.out.printf("�հ� : %d (%.1f)\n",sum,avg);
		System.out.printf("1�� : %d, �õ� : %d\n",max,min);
		
		// ��������
		for (int i =0; i < scores.length -1; i++) {
			for(int j = i + 1; j<scores.length; j++) {
				if (scores[i] > scores[j]) {
					int tmp = scores[i];
					scores[i] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		
		//<����> :
		/*
		 * scores�� ������������ �����ϴ� �ڵ��̴� 
		 * ���������� �迭�� ��ȸ�ϸ鼭 ���� ���� ���� ã�� ù��° ��ġ�� �ű��, 
		 * �״������� ���� ���� �ι�° ��ġ�� �ű�� ������ �ݺ��Ͽ� ������ �����Ѵ�.
		 * ���� ���������� �̷��� ������ ��ø�� �ݺ������� ����Ͽ� �����Ѵ� . 
		 * �ٱ��� �ݺ������� ����i�� 0����  scores �迭�� ���̿��� 1�� �� ������ ������Ų��
		 * �̴� �迭�� ��� ��Ҹ� Ȯ���ϱ� ���� �ݺ����̴�. 
		 * ���ǹ��� ����ؼ� ���� i��ġ�� ��Ұ� j��ġ�� ��Һ��� ũ�ٸ� �ο���� ��ġ�� ��ȯ
		 * �ٱ��� �ݺ����� ���� �ݺ����� ��� �����ϸ鼭 �迭�� ����Ҹ� Ȯ���ϰ�, ������������
		 * ù��° ��ġ�� �̵��Ѵ�. �״����� �ι�°�� ���� ���� �ι�° ��ġ�� �̵��ϰ�,
		 * �� ������ �ݺ��Ǹ� �迭�� ���ĵȴ�. 
		 */
		
		
		System.out.println("\n���� �� ���� : " + Arrays.toString(scores));
		
		sc.close();
		
		
		
	}

}
