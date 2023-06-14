package lv00_foundation;

import java.util.Arrays;

/*
 * 예제 1번의 arr의 길이는 6입니다. arr의 길이를 2의 정수 거듭제곱으로 만드는 방법은 0을 2개, 
 * 10개, 26개,..., 추가하는 방법이 있고 그중 최소한으로 0을 추가하는 방법은 2개를 추가하는 것입니다. 
 * 따라서 [1, 2, 3, 4, 5, 6, 0, 0]을 return 합니다.
 */
public class Ex06 {
	
	//코딩 기초 배열의 길이를 2의 거듭제곱으로 만들기
	 public static int[] solution(int[] arr) {
		 	//입력된 arr배열의 변수를 새로 넣을 공간
	    	int length = arr.length;
	    	
	    	//length의 길이와 같아지는 동안 곱해줄 변수 1초기화 
	    	int nextTwo = 1;
	    	
	    	//length의 길이과 같아질때까지 2곱해주기 
	    	while(nextTwo< length) {
	    		nextTwo *=2;
	    	}
	    	//zero변수 = 2-2
	    	int zero = nextTwo - length;
	    	
	    	//0와과 length 변수를 인덱스요소에 더한 새로운 extend 배열 
	    	int[] extend = new int[zero+length];
	    	//반복문으로 extend 인덱스에 넣어준다.
	    	for(int i =0; i<length; i++) {
	    		extend[i] = arr[i];
	    	}
	    	
	    	//추가 해야할 0의 개수만큼 0을 추가.
	    	for(int i =length; i<length + zero; i++) {
	    			extend[i] =0;
	    	}
	    	return extend;
	    }
 
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int[] num = solution(arr);
		
		System.out.println(Arrays.toString(num));
	}
	

}
