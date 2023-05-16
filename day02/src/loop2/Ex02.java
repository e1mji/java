package loop2;

public class Ex02 {
	public static void main(String[] args) {
		//1. 구구단 2단을 단일반복으로 출력. 단 x1 ~ x9가지
		//2. 1번은 중첩 반복으로 만들어서 2단을 8번 출력한다
		//3. 2번의 구문을 조금 수정해서 구구단 2단~9단까지 모두 출력한다.
		
		//1. 구구단2단을 단일반복출력하기 
		for(int i=1; i<=9; i++) {
			System.out.printf("2x%d=%d\n",i,2*i);
		}
		
		System.out.println();
		
		//2.1번을 중첩반복으로 반들어서 2단을 8번 출력하기 
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=9; j++) {
			System.out.printf("2x%d=%d\n",j,2*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3.2번의 구문을 조금 수정해서 구구단 2단~9단까지 모두 출력한다.
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			System.out.printf("%dx%d=%d\n",i,j,i*j);
			}
			System.out.println();
		}
		
		//나만의 해설:
		// 변수 i는 j가 9가 되기전까지 2이다 그러므로 
		// 2단을 출력하고, i가 하나씩증가되면서 9단까지 출력한다.
	}											

}
