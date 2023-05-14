package controlSet;

import java.util.Scanner;

// 제어문 : 코드의 흐름을 제어하는 구문 
// 1.조건문 : 참/거짓에 따라서 코드의 흐름을 분기
// 2. 반복문 : 참/거짓에 따라서 코드를 루프
// 3. 보조제어문 : 위 두 구문을 보조

public class Ex01 {
	public static void main(String[] args) {
//		if : 조건식이 참이면 종속문장을 수행
//		종속문장이란 : 특정 영역에 포함된 구문을 의미. {}안에 작성됨
//		종속문장이 한줄이면 {}를 생략해도된다.
		
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
	
		if (age >= 20) {
			System.out.println("성인");
		}
		else {
			System.out.print("미성년자");
		}
		System.out.println("입니다");
		
		//나만의 해설
		// 변수 age가 20보다 크거나 같으면  print문 성인을 출력하고 
		// else : 아니면 미성년자를 출력한다.
		// 조건식을 빠져나오면 println(입니다)를 출력한다. 
		
		sc.close();
	}

}
