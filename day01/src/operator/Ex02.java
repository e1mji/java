package operator;

public class Ex02 {
	public static void main(String[] args) {
		//대입연산자 : 값을 할당하는 연산자
		// 1. 좌변은 '공간', 우변은  '결과값'
		// 2. 항상 우변부터 수행한다
		// 3. 양변의 자료형을 일치시키도록  한다
		
		int n = 10 + 3;
		System.out.println("n = "+ n + "\n");
		
		//복합 대입 연산자 : 산술 + 대입
		n +=5;	// n = n+5;
		System.out.println("n = " + n);
		
		n -= 2;
		System.out.println("n = " + n);
								
		n *= 3;
		System.out.println("n = " + n);
		
		n /= 5;
		System.out.println("n = " + n);
		
		n %= 7;
		System.out.println("n = " + n);
	}

}
