package loop;

public class Ex06 {
	public static void main(String[] args) {
		//지역변수
		//-특정 영역 안에서 생성된 변수
		//- 해당영역이 끝나면 메모리상에서 제거된다
		
		for (int i=1; i<=5; i++) {
			System.out.println(i+":Hello World!!");
		}					
		System.out.println();
		
		//System.out.println("반복후 i = " + i);
		// -i는 for문에서 선언된 지역변수
		// -따라서 for문이 끝나면 사라진다.
		
		int j;
		
		for (j=1; j<=5; j++) {
			System.out.println(j+":Hello World!!!");			
		}
		System.out.println("반복 후 j = "+ j );
		//j는 전역변수 즉 main에서 작성된 지역변수
		//main이 끝나기전까지는 사라지지않는다
		//main = 모든 자바프로그램은 main메서드에서 시작된다. 
		//프로그램이 실행되면 자바가상머신(JVM)은 main메서드를 찾아 실행한다.
	}

}
