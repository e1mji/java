package method;

public class Quiz {
	
	//1. 1~n까지 일렬로 출력하는 함수
	static void printNumber(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(i+"");
		}
		System.out.println();
	}
	
	// 2. 1~n까지의 합계를 구하는 함수 
	static int total(int n) {
		int result = 0;
		
		for (int i = 1; i<=n; i++) {
			result +=i;
		}
		
		return result;
	}
	
	//3. 배열에서 최대값을 반환하는 함수
	static int maxArr(int[] arr) {
		int mx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(mx <arr[i]) {
				mx = arr[i];
			}
		}
		return mx;
	}
	
	// 거꾸로반환하는 함수 
	static int reverse(int n) {
		int result = 0;
		
		while (n!=0) {
			result = result *10 + n%10;
			n /=10;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		//다음과 같은 퀴즈를 풀어보자
		//1. 1~n까지 일렬로 출력하는 메서드
		printNumber(5);
		printNumber(3);
		
		//2. 1~n까지의 합계를 반환하는 메서드
		int sum = total(5);
		
		System.out.println("\nsum = " + sum);
		System.out.println("total(3) = "+ total(3));
		
		
		
		//3.전달된 배열에서 메서드의 최대값을 반환
		int[] arr= new int[] {10,20,50,40,30};
		int max = maxArr(arr); //변수max는 main에서 새로만든 변수다.헷갈리지말자
		
		System.out.println("\nmax = " + max);
		
		
		
		//4.전달된 수를 거꾸로 반환
		int rev = reverse(123);
		
		System.out.println("\nrev = "+ rev);
		System.out.println("reverse(5631) = "+ reverse(5631));
		
		
		
	}

}
