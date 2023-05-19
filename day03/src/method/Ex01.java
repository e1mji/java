package method;

public class Ex01 {
	//메서드 선언 : 메서드의 실행코드가 저장된 곳
	static void hello() {
		for (int i =1; i<=5; i++) {
			System.out.println(i+"Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(); 	//메서드 호출 :선언된 메서드를 사용하는 것
		
		hello();	// 메서드의 재사용성 : 한번 선언된 메서드는 몇번이건 사용가능
		
		hello();
		
		// *메서드 호출 흐름
		// 1. 메서드가 호출되면 현재위치(=줄)을 기억하고 메서드로 이동
		// 2. 메서드가 이동 후 코드를 순차적으로 수행
		// 3. 메서드가 종료되면 1번에서 기억한 위치로 되돌아가서 남은 코드를 이어서 수행
		
	}

}
