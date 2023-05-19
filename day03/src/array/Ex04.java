package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		//1���� �迭
		int[] arr1 = new int[] {10,20,30,40,50};
		
		//2���� �迭 : 1���� �迭�� ��ҷ� ������ �迭
		int [][] arr2 = new int[][] {
			{10,20,30,40},	//0��
			{11,21,31,41},	//1��
			{12,22,32,42}	//2��
		//    0  1  2  3  ��
		};
		
		// �Ϸķ� �ۼ��ϸ� �Ʒ��� ����
		arr2 = new int[][] {{ 10,20,30,40}, {11,21,31,41}, {12,22,32,42}};
		
		System.out.println("arr2 = "+ arr2);
		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");
		
		// ����)
		System.out.println("40 = "+ arr2[0][3]);
		System.out.println("22 = "+ arr2[2][1]);
	}

}
