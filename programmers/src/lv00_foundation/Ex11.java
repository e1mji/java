package lv00_foundation;


/*
 * 홀짝에 따라 다른 값 반환하기
	문제 설명
	양의 정수 n이 매개변수로 주어질 때, n이 홀수라면  n 이하의 홀수인 모든 양의 정수의 합을 return 하고
	n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
	n	result
	7	16
	10	220
 */

public class Ex11 {
	
	static int solution(int n) {
        int answer = 0;
        for(int i =1; i<=n; i++) {
        	//  n이 홀수라면  n 이하의 홀수인 모든 양의 정수의 합을 return
        	if(n%2!=0 && i%2 !=0 ) {
        		answer +=i;
        	}
        	// n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
        	else if (n%2==0 && i%2 == 0) {
        		answer +=i*i;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int n = 7;
		int a = 10;
		System.out.println(solution(n));
		System.out.println(solution(a));
	}
}
