package basic;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		//랜덤을 활용한 업다운 게임을 시작하세요
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int answer = ran.nextInt(100)+1;
		int user;
		int cnt = 0;
		
		//while문은 true인동안 반복
		while(true) {
			System.out.print("정수입력 (1~100) : ");
			user = sc.nextInt();
			cnt ++;
			//만약 유저가 입력한 값이 랜덤값보다 높으면 down출력
			if(user> answer) {
				System.out.println("DOWN");
			}
			// 유저가 입력한 값이  랜덤 값보다 낮으면 up
			else if(user < answer){
				System.out.println("UP");
			}
			// 맞추면 break;
			else {
				break;
			}
		}	//정답입니다.
			System.out.printf("정답입니다. %d회 만에 정답을 맞췄습니다.\n",cnt);
		
	}

}
