package var;

public class Quiz {
	public static void main(String[] args) {
		// 1. 이름, 나이, 키, 주소, 성별을 저장할 변수를 선언
		// 단, 성별은 char로 선언
		String name, address;
		int age;
		double height;
		char gender;
		
		
		// 2. 1번의 변수에 값을 채운다
		name = "홍길동";
		age = 31;
		height = 176.3;
		gender = '남';
		address = "부산 광역시 수영구";
		
		
		// 3. 변수의 내용을 아래와 같이 출력한다
		// 이름 : 홍길동
		// 나이 : 31세
		// 신장 : 176.3cm
		// 성별 : 남
		// 주소 : 부산 광역시 수영구
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("신장 : " + height + "cm");
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + address);
		
	}

}
