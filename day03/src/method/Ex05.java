package method;

public class Ex05 {
	
	static void func(int n) {
		n +=5;
	}
	
	public static void main(String[] args) {
		// 지역변수 : 특정 영역에서 사용되는 변수
		//- 해당 영역에서만 사용가능하고 해당 영역이 끝나면 메모리에서 제거됨
		
		int n =15;
		
		System.out.println("n = " + n);
		
		int n1 =10;
		
		func(n1);
		System.out.println("n1 = "+ n1);
		
		// main의 지역변수 n과  func의 지역변수 n은 서로 다른 메모리 
		// #이름이 같아서 헷갈리면 이름을 다르게 쓰자
	}

}
