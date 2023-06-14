package basic;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//두 정수를 입력해서 합계를 출력하는  프로그램 while문으로  반복
		Scanner sc = new Scanner(System.in);
		int select;
		int n1  = 0 ,n2 = 0;
		
		Loop : while(true) {
			System.out.println("1. n1입력");
			System.out.println("2. n2입력");
			System.out.println("3. 합계출력");
			System.out.println("0. 종료");
			System.out.print("선택>>>");
			select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.print("입력 : ");
				n1 = sc.nextInt();
				break;
			case 2:
				System.out.print("입력 : ");
				n2 = sc.nextInt();
				break;
			case 3:
				System.out.printf("%d + %d  = %d\n",n1,n2,n1+n2);	
				break;
			case 0:
				sc.close();
				
				break Loop;	//지정한 라벨 제어문 블럭
			}					
		}
		System.out.println();
		
	}

}
