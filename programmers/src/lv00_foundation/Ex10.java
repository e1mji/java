package lv00_foundation;

import java.util.Arrays;

/*
 * 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.

	변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
	
	만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
	stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
	stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
	위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
 */

public class Ex10 {
    static int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int stkSize = 0;
        // stk에 증가시켜줄 배열의 길이
        for(int i =0; i<arr.length; i++) {
        	// 길이가 0이면서 (인덱스가 비어있으면서) stk에 [stksize-1 ( 즉 마지막 인덱스값이 ) ] arr의 [i] 보다 작으면 
         	if(	stkSize==0 || stk[stkSize-1] < arr[i]) {
         		// arr[i]요소를  stk 배열에 담기 [stkSize 인덱스 1 증가]해서 
         		stk[stkSize++] = arr[i];
         	}
         	// 아니면 stkSize가 0보다 크면서 stk사이즈의 마지막 요소가 arr[i] 보다 크거나 같으면 
        	else if (stkSize >0 || stk[stkSize-1] >= arr[i]){
        		//인덱스 요소  하나 지우기 
        		stkSize--;
        		i--;
        	}
        }
        // result 배열의 길이는 stkSize만큼 .
        int[] result = new int[stkSize];
        for(int j = 0; j<stkSize; j++) {
        	// 반복문으로 result배열에 stk[j]값을 담아준다.
        	result[j] = stk[j];
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,4,2,5,3};
		int[] a = solution(arr);
		System.out.println(Arrays.toString(a));
	}
}
