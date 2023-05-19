package method;

public class Ex03 {
	//매개변숭에는 전달인자가 순서대로 채워진다 
	static void adder(int n1, int n2) {
		System.out.printf("n1 = %d, n2 = %d\n",n1,n2);
		
		System.out.println("n1 + n2 = "+ (n1 + n2) + "\n");
	}
	
	public static void main(String[] args) {
		adder(5,3);
		
		adder(3,5);
		
		//잘못된 사용방식
		// adder(5);	//전달인자 부족
		// adder(5, 3, 1);	//매개변수 부족
		// adder (5,3.0); 	//자료형 불일치
	}

}
