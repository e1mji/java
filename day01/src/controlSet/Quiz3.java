package controlSet;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		//PDF 3��)
		Scanner sc = new Scanner(System.in);
		int station,total;
		
		System.out.print("������� ? :");
		station = sc.nextInt();
		
		//1.�ð� ���ϱ� 
		total = station *2;
		
		if(station >=10) {
			total = station *4;;
		}
		
		//2. ��/�� ������
		if (total >= 60) {
			int hour = total /60;		//64/60 = 1
			int minute = total %60;		//64%60 = 4
			
			System.out.printf("�Ѽҿ�ð� : %d�ð� %d�� \n",hour,minute);
		}
		else {
			System.out.println("�Ѽҿ�ð� " + total + "��");
		}
		
		//������ �ؼ�:
		//�켱 ������������ 10������ �̻��̸� 4���� �ɸ���  10���� �̸��̸� 2���̰ɸ��ٴ� �����Ͽ�
		// ���� total�� ���� total = �� *2���̴�. 10�������̻��� ������ ���ǹ��� �̿��Ѵ�
		// ���⼭  ����Ʈ�� ��,�� ���ϱ��̴�. ���࿡  60���̳Ѿ�ٸ�
		// 00�ð� 00������ ǥ��������. �ð��� ������ ������ ȯ�����ְ�
		// ���� ������ �������� ȯ�����ָ�  ���� 64���̶�� 1�ð� 4���� �ǰڴ�. 
		// else������ 60���� �����ʴ´ٸ� total + �� �� ����Ѵ�. 
				
		sc.close();
	}

}
