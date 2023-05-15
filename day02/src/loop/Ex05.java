package loop;

public class Ex05 {
	public static void main(String[] args) {
		//반복문 for문
		//- 초기/조건/증감식이 한곳에 모여있는 구문
		//- 따라서 ,횟수 파악이 용이하다
		// - 주로 ,지정횟수의 반복 혹은 배열의 반복에 자주사용된다
		
		//for(초기값;  조건식; 증감식){종속문장}
		for (int i=1; i<=5; i++) {
			System.out.println(i+":Hello World!!!");
		}
		//for문 동작순서)
		// 초기값 -> 조건식 -> 종속문장 -> 증감식 -> 조건식-> 종속문장 ->조건식...
		
		//i는 지역변수 초기값 1; i가 5가 될때까지 i를 증가시킨다.
		// i=1 => 1 Hello World!!!출력 -> i=2;=> 2HelloWordl!!!출력
	}

}
