package lv00_foundation;

/*
 * 
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

	12 ⊕ 3 = 123
	3 ⊕ 12 = 312
	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
	
	단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
 */
public class Ex04 {
		//코딩기초트레이닝 ( 두정수를 붙혀서 비교)
	   static int solution(int a, int b) {
		// 정수 a와 b를 매개변수로 받는다. 
		   // ab변수는 parseInt내장함수 전달요소에 정수형 변수 a와 b의 자료형을 문자열로 바꾼뒤 더해준다)
		   // ba변수는 반대로 더해준다. 
	       int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
	       int ba = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
	       
	       // 문자열끼리 더해진 ab변수가 ba변수보다 크거나 같으면 
	       // ab리턴 
	       if(ab>=ba) {
	    	   return ab;
	       }
	       //아니면 ba리턴 
	       else {
	    	   return ba;
	       }
	    }
	   
	public static void main(String[] args) {
		// main함수에서의 테스트
		int a = 12;
		int b = 3;

		System.out.println(solution(a, b));
		
	}

}
