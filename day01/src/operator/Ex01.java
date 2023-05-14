package operator;
//연산자 : 데이터를 가공하여 새로운 데이터를 얻는 기호들
//종류) 산술, 대입, 증감, 비교, 논리, 조건 등



public class Ex01 {
	public static void main(String[] args) {
		// 산술 연산자 : 사칙 연산을 수행
		int n = 10;
		
		System.out.println("n + 3 = " + (n + 3));
		System.out.println("n = " + n + "\n");		// 산술 연산은 변수에 변화를 주지 않는다
		
		System.out.println("n - 3 = " + (n - 3));
		System.out.println("n * 2 = " + n * 2);
		System.out.println("n / 6 = " + n / 6);
		System.out.println("n % 6 = " + n % 6);
									// /=몫 , % = 나머지 (헷갈리지말자)
		
	}

}
