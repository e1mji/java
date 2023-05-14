package var;

public class Ex03 {
	public static void main(String[] args) {
		//printf() : 형태를 잡고 뒤에서 데이터를 채워서 출력 
		// -%s : String, 문자열자리
		// -%d : Decimal, 10진 정수자리
		// -%f : Float. 실수자리 
		// -%c " Character, 문자자리 
		
		String name = "홍길동";
		int age = 16;
		double height = 161.3;
		char gender = '남';
		
		System.out.printf("이름 : %s (%d세, %c)\n",name,age,gender);
		System.out.printf("신장 : %f cm\n", height);
		// %f 는 기본 소수점 6자리를 출력
		
		System.out.printf("신장 : %.1f cm\n",height);
		
	}

}
