package loop;

public class Quiz4 {
	public static void main(String[] args) {
		//첫날에 1원을 예금하고 매일 2배씩 예금했을때 30일의 저축액 
		int money =1;
		int total =0;
		
		for(int i=1; i<=30; i++) {
			total += money;
			
			//디버깅)
			System.out.printf("%d일) 예금 : %d원, 저축 :%d원\n",i,money,total);
			money *=2;
		}
		System.out.println("총액 : " + total + "원");
		
	}
	//나만의 해설:
	//money의 변수 초기값은 1이다. 지역변수 i의 초기값은 1이고 30일까지 루프시킨다.
	//total의 변수를 0으로 초기화시켜준다. for문을 돌고 1씩증감이 될때마다
	//money변수에 복합대입연산자로 2배씩 곱해준다. 
	//total 약 10억7천만원이 예금된다.

}
