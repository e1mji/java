package method;

//메서드 오버로딩(overloading)
// - 같은 이름의 메서드를 여러개 작성하는 방식
// - 메서드의 이름은 같아야하고, 매개변수 형태가 달라야 한다.

public class Ex06 {
	
	static int adder(int n1, int n2) {
		return n1+n2;
	}
	
	static int adder(int n) {
		return n + 10;
	}
	
	static double adder(double n) {
		return n +3.14;
	}
	
	static int adder() {
		return 10+ 20;
	}
	
	public static void main(String[] args) {
		
		System.out.println("결과 : " + adder(5,3));
		System.out.println("결과 : " + adder(5));
		System.out.println("결과 : " + adder(5.0));
		System.out.println("결과 : " + adder());
		
		
	}
	

}
