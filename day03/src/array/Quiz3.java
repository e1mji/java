package array;

import java.util.Arrays;
import java.util.Random;

public class Quiz3 {
	public static void main(String[] args) {
		// 1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for (int i =0; i<arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int evenCount=0;
		int oddCount=0;
		for (int i =0; i<arr.length; i++) {
			if(arr[i] % 2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.printf("홀수: %d \n 짝수 : %d\n",oddCount,evenCount);
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];
		int evenIndex = 0;	// 짝수 인덱스 값을 따로 관리할 변수 지정 및 초기화 
		int oddIndex  = 0;	// 홀수 인덱스 값을 따로 관리할 변수 지정 및  초기화 
		
		for(int i =0; i<arr.length; i++) {		  
			if(arr[i]%2 ==0) {					 
//			evenArray[i] = arr[i];	// 여기서 내생각은 반복문이기 때문에 조건만 걸어주면 순차적으로 even Array에 들어갈 것이라고 생각했다. 
									// 이렇게 되면 arr의 i요소가 2로나누어떨어지면  
									// 인덱스 요소를 추가적으로 증가시키지않고 매번 그 값을 덮어쓰게된다.
			evenArray[evenIndex++] = arr[i];	//i가 2로 나누어떨어지면 evenIndex변수를 증가시켜서 값을 순차적으로 추가해준다.
			}										
			else {
				oddArray[oddIndex++] = arr[i];	//홀수 여도 마찬가지
			}
		}
		System.out.println("짝수는 : " + Arrays.toString(evenArray));
		System.out.println("홀수는 : " + Arrays.toString(oddArray));
		
		
		// 3) arr의 총합을 구하여 출력하세요
		
		int total = 0;
		for (int i =0; i<arr.length; i++) {
			total+=arr[i];
		}
		System.out.println(total);
	}

}
