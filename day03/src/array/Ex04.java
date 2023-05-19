package array;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		//1차원 배열
		int[] arr1 = new int[] {10,20,30,40,50};
		
		//2차원 배열 : 1차원 배열을 요소로 가지는 배열
		int [][] arr2 = new int[][] {
			{10,20,30,40},	//0행
			{11,21,31,41},	//1행
			{12,22,32,42}	//2행
		//    0  1  2  3  열
		};
		
		// 일렬로 작성하면 아래와 같다
		arr2 = new int[][] {{ 10,20,30,40}, {11,21,31,41}, {12,22,32,42}};
		
		System.out.println("arr2 = "+ arr2);
		System.out.println("arr2[0] = " + Arrays.toString(arr2[0]));
		System.out.println("arr2[0][1] = " + arr2[0][1] + "\n");
		
		// 연습)
		System.out.println("40 = "+ arr2[0][3]);
		System.out.println("22 = "+ arr2[2][1]);
	}

}
