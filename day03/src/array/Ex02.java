package array;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// 빈 배열은 크기를 미리 작성해야 한다
		// - 빈 배열은 자동으로 기본 값으로 초기화된다.
		int[] arr = new int[5];	//나 공간 5개입니다~
		
		//배열에 도움이 되는 클래스가 있다. Arrays
		// - 그 중 toString()은 배열의 요소를 문자열로 모두 반환하는 함수
		System.out.println("arr = "+ Arrays.toString(arr));
		
		arr[0] = 100;
		arr[2] = 50;
		arr[4] = 33;
		
		System.out.println("arr = " + Arrays.toString(arr) + "\n");
													
		System.out.println("arr의 크기(=개수) : " + arr.length + "\n");
		//-Java의 배열은 내부에 자체적으로 크기값을 가지고있는 변수가 있다. 
		
		//index는 0부터 순차적으로 매겨진다.
		//따라서, 반복문과 사용하면 시너지가 좋다.
		for (int i =0; i< arr.length; i++) {
			System.out.printf("arr[%d] = %d\n", i,arr[i] );
		}
	}

}
