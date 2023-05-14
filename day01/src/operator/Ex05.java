package operator;

public class Ex05 {
	public static void main(String[] args) {
		//논리연산자 : 참/거짓을 연산
		
		//1. && : AND, 양쪽모두 참이면 결과가 참
		System.out.println("true AND true 결과 : " + (true && true));
		System.out.println("true  AND false 결과 : " + (true && false));
		System.out.println("false AND true  결과 : " + (false && true));
		System.out.println("false AND false 결과 : " + (false && false));
		System.out.println();		
		//이 두줄의 코드는 데드코드다 즉 앞2줄코드에서 이미 판별이 끝나버렸기에 의미가없다.
													
		
		// 2. || : OR, 양쪽 모두 거짓이면 결과가 거짓
		System.out.println("true  OR true  결과 : " + (true || true));
		System.out.println("true  OR false 결과 : " + (true || false));
		System.out.println("false OR true  결과 : " + (false || true));
		System.out.println("false OR false 결과 : " + (false || false));
		System.out.println();
				//마찬가지로 윗2줄코드고 죽은코드 or은 한쪽만 참이면 참이므로 
		
		// 3. ! : NOT, 참을 거짓으로 거짓을 참으로
		System.out.println("NOT true  결과 : " + !true);
		System.out.println("NOT false 결과 : " + !false);
	}

}
