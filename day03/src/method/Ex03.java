package method;
 
public class Ex03 {
	static int absolut(int num) {
		int answer = 0;
		if (num < 0) answer = - num;
		else		answer = num;
		return answer;
	}
	// 두 정수를 전달하여, 큰 값을 반환하는 함수를 작성하세요 
	static double circle(int width) {
		double answer = 0;
		answer = (width*0.5) * (width*0.5) * 3.14;
		return  answer;
		
	}
	// 정수로 반지름을 전달받아서, 원의 넓이를 계산하여 반환하는 함수를 작성하세요
	static int bigNumber(int n1,int n2) {
		return n1> n2 ? n1: n2;
	}
	
	public static void main(String[] args) {
		// 정수를 하나 전달받아서 정수의 절대값을 반환하는 함수
		// int를 하나 전달받아서, int를 반환한다 (반환값은 하나만 가능)
	
		System.out.println("absolute(-3) : " + absolut(-3));
		System.out.println("absolute(3) : " + absolut(3));
		
		
		System.out.println("circle : " + circle(3));
		

		System.out.println("bigNumber : " + bigNumber(3, 5));
																
		
		
		
	}

}
