package input;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//이름, 나이,주소를 입력받을 변수를 선언해보자
		
		String name,address;
		int age;
		
		//2. Scanner를 활용해서 1번의 변수에 입력을 받는다 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print(" 주소 : ");
		address = sc.nextLine();
		
		// 3. 결과는 아래와 같다
		// 이름 : 홍길동 (17세)
		// 주소 : 부산광역시 수영구
		
		System.out.printf("\n이름 : %s(%d세)\n",name,age);
		System.out.println("주소 : " + address);
		
		sc.close();
		
		
	}

}
