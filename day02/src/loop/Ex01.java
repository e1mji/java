package loop;		// 3번 패키지

// 반복문
// - 조건식이 참이면 종속문장을 수행
// - 종속문장이 끝나면 다시 처음으로 되돌아 온다

public class Ex01 {
	public static void main(String[] args) {
		int i = 1;			// 초기값
		
		while (i <= 5) {	// 조건식
			System.out.println(i + " : Hello World!!!");
			i++;			// 증감식
		}
		
		System.out.println("반복 후 i = " + i);
		
		// ※ 원하는 횟수를 반복하려면 초기/조건/증감을 잘 조합해서 쓴다
	}
}
