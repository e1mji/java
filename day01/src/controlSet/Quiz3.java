package controlSet;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		//PDF 3번)
		Scanner sc = new Scanner(System.in);
		int station,total;
		
		System.out.print("정거장수 ? :");
		station = sc.nextInt();
		
		//1.시간 구하기 
		total = station *2;
		
		if(station >=10) {
			total = station *4;;
		}
		
		//2. 시/분 나누기
		if (total >= 60) {
			int hour = total /60;		//64/60 = 1
			int minute = total %60;		//64%60 = 4
			
			System.out.printf("총소요시간 : %d시간 %d분 \n",hour,minute);
		}
		else {
			System.out.println("총소요시간 " + total + "분");
		}
		
		//나만의 해설:
		//우선 버스정거장이 10정거장 이상이면 4분이 걸리고  10구간 미만이면 2분이걸린다는 가정하에
		// 변수 total을 선언 total = 역 *2분이다. 10정거장이상의 조건을 조건문을 이용한다
		// 여기서  포인트는 시,분 구하기이다. 만약에  60분이넘어간다면
		// 00시간 00분으로 표기해주자. 시간은 나눠서 몫으로 환산해주고
		// 분은 나눠서 나머지로 환산해주면  만약 64분이라면 1시간 4분이 되겠다. 
		// else문으로 60분이 넘지않는다면 total + 분 을 출력한다. 
				
		sc.close();
	}

}
