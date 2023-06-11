package basic;

import java.util.Random;

public class Ex01 {
	//태어난 년도를 4자리, 월 2자리, 일 2자리에 -를 붙혀서 출력한다.	
	public static void main(String[] args) {
		int birth = 19960408;
		int year,month,date;
		
		date = birth%100;
		year = birth/10000;
		birth = birth/100;
		month = birth%100;
		
		System.out.printf("생일 : %d년%d월%d일",year,month,date);
		System.out.println();			
		
		// - 난수의 범위를 제한할 수 있다.
		Random ran = new Random();
		int randonValue = ran.nextInt();
		
		if(randonValue < 0) {
			randonValue = - randonValue;	//단항부호 반전연산
		}
		int dice = randonValue % 6 +1;
		System.out.println(randonValue);
		System.out.println(dice);
	}

}
