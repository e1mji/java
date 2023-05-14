package operator;

public class Ex04 {
	public static void main(String[] args) {
		// 비교 연산자 : 데이터의 대소 관계를 비교
		// - 비교 결과는 boolean. 즉, 참/거짓
		
		int n = 10;
		
		System.out.println("n > 5 결과 : " + (n > 5));
		System.out.println("n < 10 결과 : " + (n < 10));
		
		System.out.println("n <= 10 결과 : " + (n <= 10));
		System.out.println("n >= 5 결과 : " + (n >= 5));
		
		System.out.println("n == 10 결과 : " + (n == 10));	// 같으면 참, 다르면 거짓
		System.out.println("n != 10 결과 : " + (n != 10));	// 같으면 거짓, 다르면 참
		
		
		// 비교의 결과는 boolean 타입의 변수에 저장 가능
		boolean result = (10 == 11);
		
		System.out.println("\nresult = " + result);
	}

}
