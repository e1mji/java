package basic;


import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//카드번호 16자리를 4자리씩 끊어서 출력해보자
		long cardNumber;
		//스캐너로 입력받고
		Scanner sc = new Scanner(System.in);
		
		//ANSWER를 비워준다.
		String answer = "";
		
		//카드번호를 입력으로 받고
		System.out.print("카드 번호 16자리를 입력 : ");
		//키보드로 받은 입력값을 LONG타입으로 변환 
		cardNumber = Long.parseLong(sc.nextLine());
		
		System.out.println("cardNumber : "  + cardNumber);
		
		//1234-5678-9876-5432
		long n1,n2,n3,n4;
		
		// 맨뒤 4자리를 10000으로 나눠서 나머지 대입= 5432
		n4 = cardNumber % 10000;
		// 카드번호를 10000으로 나눠서  몫을 대입 =123456789876
		
		// ▽ 반복
		cardNumber = cardNumber/ 10000;
		n3 = cardNumber % 10000;

		cardNumber = cardNumber/10000;
		n2 = cardNumber % 10000;
		n1 = cardNumber / 10000;
		answer = n1+"-"+n2+"-"+n3+"-"+ n4;
		System.out.println(answer);
		sc.close();
		
		//반복문으로 만들어보자
		long[] arr = new long[] {n1,n2,n3,n4};
		for(int i =arr.length-1; i<=0; i++) {
			arr[i] = cardNumber%10000;
			cardNumber = cardNumber/10000;
		}
		System.out.print(arr[0]);
		for(int i =1; i<arr.length; i++) {
			System.out.print("-"+arr[i]);
		}
		System.out.println();
		
	}

}
