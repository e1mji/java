package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 1부터 1000까지의 수를 세는데 
		// 3과 5의  배수는 합계에 포함시키고 3의배수는 건너뛰기
		int sum = 0;
		
		for(int i =1; i<=1000; i++) {
			if(i%3 == 0 && i%5==0) {
				//여기는 빈 구문 자체가 의미가 있다~
			}
			else if(i%3 == 0) {
				continue;
			}
			sum += i;
			
			//디버깅 코드 : 코드의 무결성을 검증하는 모든 행위를 의미한다.
			System.out.printf("i=%d, sum = %d\n",i,sum);
		}
		System.out.println("결과 : " + sum);
	}

}
