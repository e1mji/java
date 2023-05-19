package method;

public class Ex02 {
	
	//매개변수 (parameter) : 메서드 호출시 전달되는 값을 저장
	static void hello(int n) {
		for (int i=1; i<=n; i++) {
			System.out.println(i+ " : Hello World!!!");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		hello(3);	//전달인자 (=arguments) : 메서드에 전달하는 값
		
		hello(2);
		
		hello(6);
		
		//잘못된 사용방식
		//hello();		//전달인자 개수 부족 
		//hello(5,3);	//매개변수 개수 부족 
		//hello("5");	//자료형 불일치
		
		//# 결론) 메서드 호출시 전달인자와 매개변수는 개수 및 자료형을 일치시킨다!!!
	}

}
