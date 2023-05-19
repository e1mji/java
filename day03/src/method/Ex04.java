package method;
/*
 * 메서드의 형태
 * 1.반환 값이 없는 메서드 : void형 메서드
 * - 코드를 실행만 할 뿐 돌려주는 결과 값이 없는 메서드
 * 
 * 2. 반환값이 있는 메서드 : 자료형이 있는 메서드
 * -코드를 실행하고 얻은 결과를 돌려주는 메서드
 */

public class Ex04 {
	
	//void형 메서드 
	static void adder1(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n",n1,n2,sum);
	}
	
	//int형 메서드
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		//void형 메서드는 돌려주는 결과가 없으므로 이름만 호출해서 사용
		adder1(5,3);
		
		//int형 메서드는 정수의 결과를 돌려주기 때문에, 1. 변수에 저장하거나
		int result = adder2(5,3);
		
		System.out.println("result = " + result);
		
		// 2. 다른 메서드의 전달값으로 바로 사용한다 
		System.out.println("adder(7,2) = " + adder2(7,2));
		
		//연습)
		int n = adder2(adder2(5,1), adder2(9,2));
		
		System.out.println("n : " + n);
		
	}

}
