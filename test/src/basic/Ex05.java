package basic;

import java.util.Scanner;

/*
	놀이기구 이용시간에 따른 요금을 계산하여 출력하세요
	
	기본 요금은 3천원이며 10분당 500원의 요금이 추가로 발생합니다
	기본 요금이 적용되는 구간은 0 ~ 30분입니다
	
	시간			금액
	 0 ~ 30		3,000원
	31 ~ 40		3,500원
	41 ~ 50		4,000원
	51 ~ 60		4,500원
	...
	
	이후 시간대에서도 동일한 규칙으로 적용되어야 합니다
 */

public class Ex05 {
	public static void main(String[] args) {
		//내가 쓴 코드 
		Scanner sc = new Scanner(System.in);
		int fee = 3000;
		int time;
		
		System.out.print("이용시간 입력 : ");
		time = sc.nextInt();
		
		
		if(time>=31) {
			fee = 3500 + 500 * ((time-31)/10);
		}
		
		System.out.println("이용시간 : " +fee);
		
		
		
		//강사님 코드
		
		int time1;	// 시간
		int cost;	// 요금
		
		System.out.print("이용 시간 입력 : ");
		time1 = sc.nextInt();
		
		if(0 <= time1 && time1 <= 30) {	// 기본 시간 이하로 이용했다면	
			cost = 3000;				// 기본 요금 3천원 적용
		}
		
		else {	// 기본 시간보다 크다면
				// 기본 요금 + 추가 요금
			
			if(time1 % 10 == 0) {	// 이용시간이 10분단위로 나누어 떨어질 때
				cost = 3000 + (500 * (((time1 - 30) / 10) + 0));	
			}
			else {					// 이용시간이 10분단위로 나누어 떨어지지 않을때
				cost = 3000 + (500 * (((time1 - 30) / 10) + 1));	
			}
		}
		System.out.printf("요금 : %,d원\n", cost);
		sc.close();
		
		
	}

}
