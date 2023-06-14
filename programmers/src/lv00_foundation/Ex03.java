package lv00_foundation;


/*
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

	12 ⊕ 3 = 123
	3 ⊕ 12 = 312
	양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
	
	단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 */
public class Ex03 {
	//코딩 기초 (두정수 합쳐서 비교하기 2)
	static int solution(int a, int b) {
		// ab변수를 parseInt로 바꿔서 더해준다. 
        int ab = Integer.parseInt(Integer.toString(a)+ Integer.toString(b));
        // Twoab 변수에는 2 x a x b
        int Twoab= 2 * a * b;
        
        // 만약 ab가 크면 ab리턴
        if(ab> Twoab) {
        	return ab;
        }
        // Twoab가 크면 Twoab리턴
        else if(Twoab>ab) {
        	return Twoab;
        }
        // 서로 같으면 ab리턴
        else {
        	return ab;
        }
    }
	
	public static void main(String[] args) {
		int a = 4;
		int b = 56;
		System.out.println(solution(a, b));
	}

}
