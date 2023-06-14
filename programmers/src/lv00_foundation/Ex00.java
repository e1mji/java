package lv00_foundation;

public class Ex00 {
	static String solution(String my_string, int k) {
		// 곱해준 문자열을 담아줄 변수 초기화 
		String answer = "";
		
		//반복문 i는 k값이 될때까지 answer 값에  매개변수 my_string 더해준다.
		for(int i =0; i<k; i++) {
			answer +=my_string;
		}
		//반환
		return answer;
	}
	public static void main(String[] args) {
		String s1 = "string";
		int n=3;
		
		//함수호출
		System.out.println(solution(s1, n));
	}

}
