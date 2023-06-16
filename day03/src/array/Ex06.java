package array;

public class Ex06 {
	public static void main(String[] args) {
		
		int n1 =5, n2 = 12, n3 = 4;
		int max;
		max= n1;
		if (max < n2) {
			max = n2;
		}
		if (max < n3) {
			max = n3;
		}
		System.out.println("max : " + max);
		System.out.println();
		
		int[] arr = {17,26,33,52,46,87,69,92,76};
		max = 0;
		for( int i =0; i<arr.length; i++) {
			if(max < arr[i])
			max = arr[i];
		}
		System.out.println("max : "+ max);
		System.out.println();
		
		// 1) arr의 값 중에서, 홀 수 이면서 가장 큰 값을 찾아서 출력하세요
		int oddMax = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2 !=0 && oddMax <arr[i]) {
				oddMax = arr[i];
			}
		}
		System.out.println("1)홀수 중 가장 큰 값  : " + oddMax);
		
		// 2) arr의 값 중에서, 짝수인 값의 합계
		int evenSum = 0;
		for(int num : arr) {
			if(num %2 == 0) {
				evenSum+= num;
			}
		}
		System.out.println("2)짝수의 합계 :" + evenSum);
		
		// 3)arr의 모든 평균 값을 구하여 소수점 둘째 자리까지 출력하세요
		int sum = 0;
		for(int num : arr) {
			sum +=num;
		}
		double avg = sum / (double) arr.length;
		System.out.printf("3) 평균 : %.2f\n",avg);
		
	}

}
