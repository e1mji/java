package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// �� �迭�� ũ�⸦ �̸� �ۼ��ؾ� �Ѵ�
		// - �� �迭�� �ڵ����� �⺻ ������ �ʱ�ȭ�ȴ�.
		int[] arr = new int[5];	//�� ���� 5���Դϴ�~
		
		//�迭�� ������ �Ǵ� Ŭ������ �ִ�. Arrays
		// - �� �� toString()�� �迭�� ��Ҹ� ���ڿ��� ��� ��ȯ�ϴ� �Լ�
		System.out.println("arr = "+ Arrays.toString(arr));
		
		arr[0] = 100;
		arr[2] = 50;
		arr[4] = 33;
		
		System.out.println("arr = " + Arrays.toString(arr) + "\n");
													
		System.out.println("arr�� ũ��(=����) : " + arr.length + "\n");
		//-Java�� �迭�� ���ο� ��ü������ ũ�Ⱚ�� �������ִ� ������ �ִ�. 
		
		//index�� 0���� ���������� �Ű�����.
		//����, �ݺ����� ����ϸ� �ó����� ����.
		for (int i =0; i< arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i,arr[i] );
		}
	}

}
