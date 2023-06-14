package lv00_foundation;

//기초트레이닝 수열과 구간 쿼리 4

public class Ex08 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[][] queries = {{1,3,2},{2,4,3},{0,2,1}};
		int[] result = solution(arr,queries);
		
		for(int num : result) {
			System.out.println(num+ " ");
		}
	}
	
	static int[] solution(int[]arr, int[][] queries) {
		//결과를 저장할 배열 생성 
		int[] result = new int[arr.length];
		
		//arr배열의 값을 복사하여  새 배열  result 생성
		for(int i=0; i<arr.length; i++) {
			result[i] = arr[i];
		}
		
		// queries 배열 순회 start,end,k값 추출 
		for(int[] query : queries) {
			int start = query[0];
			int end = query[1];
			int k = query[2];
			
			// i가 k의 배수인지 확인 배수이면 i값을 증가 ㄴ
			for(int i= start; i<=end; i++) {
				if(i % k==0) {
					result[i] +=1;
				}
			}
		}
		
		return result;
	}

}
