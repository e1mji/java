package var;

public class Ex02 {
	public static void main(String[] args) {
		
		//강제형변환 : 개발자가 직접 명시한 타입으로 자료형을 변환 
		
		// 아래는 자동 형변환
		System.out.println("10 / 3 = " + 10 / 3);
		System.out.println("10 / 3.0 = " + 10 / 3.0 + "\n");
		
		
		int n1 = 10, n2 = 3;	// 변수는 한번에 같은 타입을 콤마(,)로 생성 가능
		
		System.out.println("n1 / n2 = " + n1 / n2);
		System.out.println("n1 / n2 = " + n1 / (double)n2 + "\n");
		
		
		// n2는 영구적으로 double이 됐을까?? x, 일시적
		System.out.println("n2 = " + n2); 

	}

}
