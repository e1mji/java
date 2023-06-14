package lv00_foundation;


//조건에 맞게 수열 변환하기 2
public class Ex09 {
	static int solution(int[] arr) {
		
		int answer = 0;
		int count = 0;
		
		
		//arrX배열은 이전 반복에서 arr배열의 저장하기 위한 배열
		// 현재 반복에서 arr배열과 비교하기 위해 사용된다. 
		int[] arrX = new int[arr.length];

		
		
		while (count != arr.length) {
			//count값을 초기화
			count = 0;
			//arrX배열에서 arr배열을 복사 
			arrX = arr.clone();

			//arr의 길이만큼 순회하면서 수열 변환 작업 수행 

			for (int i = 0; i < arr.length; i++) {
				
				// 짝수이면서 50 이상일 경우 해당요소를 2로 나누고 
				if (arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] /= 2;
					
				// 홀수이면서 50 미만일경우,2를 곱하고 1을더한다. 
				} else if (arr[i] % 2 != 0 && arr[i] < 50) {
					arr[i] = arr[i] * 2 + 1;
				}
				// 만약 arr과 arrX가 같다면  동일한요소 개수를 세고 변수에 저장.
				if (arr[i] == arrX[i]) {
					count++;
				}
			}
			
			// answer의 값을 증가시킨다. 
			answer++;
		}
		//answer에서 1을 뺀 값을 반환한다.
		// 동일한 반복이 되는 순간까지 반복횟수를 구하기 위해서 answer값에서 1을빼준다. 
		// 반복작업이 한번만 수행되면 answer값은 1이 되고 ,동일한 배열이 되는 순간까지의 
		// 반복 횟수는 1-1 =0이 된다.
		return answer - 1;
	}



	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 100, 99, 98 };

		int result = solution(arr);
		System.out.println(result);

	}

}
