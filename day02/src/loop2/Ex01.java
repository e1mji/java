package loop2;

public class Ex01 {
	public static void main(String[] args) {
		// 중첩반복문
		// - 반복문 안에 반복문을 구성하는 방식
		for(int i=1; i<=3; i++) {		// 바깥 for문 : 행반복
									
			for (int j=1;  j<=5; j++) {	// 안쪽 for문 : 열 반복 
				System.out.print(j+" ");
			}
			System.out.println();						
		}
		
		//나만의 해석 :
		//바깥 for문은 행반복이므로 3줄을 돌리겠다는 의미이다.
		//안쪽 for문은 열 반복이다.그러니까 첫번째 반복 1 2 3 4 5 가끝나면 
		//다시 바깥for문의 지역변수i가 2가되어서 두번째 줄에서 1 2 3 4 5를 출력한다.
	}

}
