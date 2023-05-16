package array;

public class Ex01 {
	public static void main(String[] args) {
		//일반 자료형
		int n=10;
		//참조자료형 : []가 붙은 배열은 참조 타입이다(#pythonTutor참고)
		// - 코딩에서 참조는 어떠한 데이터를 가리키는 것을 의미한다.
		//						0  1  2	 3  4  (=index.순서번호)
		int[] arr = new int[] {10,20,30,40,50};
		
		System.out.println("n = "+ n);
		System.out.println("arr = "+ arr+"\n");
		// -참조 변수를 직접 출력하면 '해시코드'라는 이상한 값이 출력된다
		// - 해시코드는 데이터의 '고유번호(=주민등록번호)'라고 생각하면 좋다
		
		System.out.println("arr[0] = "+ arr[0]);
		System.out.println("arr[0] = "+ arr[1]);
		System.out.println("arr[0] = "+ arr[4]);
		
		// - 배열에 저장된 데이터를 '요소(= elements)" 라고 한다
		// - 요소를 접근하려면 참조변수와 index가 필요하다.
		
		//System.out.println("arr[5] = "+ arr[5]);
		// -범위를 초과하는 참조는 에러~ 5번의 인덱스가 없기때문.
	}

}
