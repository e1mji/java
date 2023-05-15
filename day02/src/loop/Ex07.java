package loop;

public class Ex07 {
	public static void main(String[] args) {
		//보조 제어문
		//break : 제어문을 '즉시' 종료시킨다.
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i+ "");
		}
		System.out.println();
		
		//2. continue : 제어문을 '즉시'처음으로
		for (int i=1; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//나만의 해석
	// for문을통해 지역변수i는 10이 될때까지 증가하며
	// 종속문장을 실행하기로 되어있다
	// 여기서 if조건문으로 만약 i가 5가 될때
	// break로 즉시반복문을 빠져나온다.=> 1234
	
	//continue는 제어문을 즉시처음으로 되돌리기에 
	//변수 i는 5가되면 출력문으로 넘어가지않고 다시 처음으로 되돌아가서
	//조건식을 수행한다. =>1234 678910

}
