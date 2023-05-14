package var;

public class Ex01 {
	public static void main(String[] args) {
		// 어제 배운 Java의 기본 자료형 중 문자열은 없다
		// - 여기서 기본 자료형을 제외한 모든 자료형을 '참조 자료형'이라고 한다
		// - 참조 자료형은 배열과 클래스 파트에서 자세히 다룹니다
		
		String str = "apple";
		
		System.out.println("str = " + str);
		
		
		str = "banana";		// 문자열은 " " (쌍따옴표)
		
		System.out.println("str = " + str);
		
		
		char ch = 'a';		// 문자는 ' ' (홑따옴표)
		
		System.out.println("ch = " + ch);
		
		
		
	}

}
