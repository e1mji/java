package input;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 버퍼 : 데이터를 임시로 저장하는 공간
		//- Scanner는 버퍼를 활용해서 키보드 값을 읽어온다 
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.print("두 정수 입력 :");
		n1 = sc.nextInt();	//next() : 버퍼에서 데이터를 가져온다 (space와 enter)
		n2 = sc.nextInt();	//- 만약 버퍼에 데이터가 없으면 사용자에게 입력을 요구 
		
		System.out.printf("n1 = %d , n2 = %d\n\n",n1,n2);
		
		sc.nextLine(); //nextLine() : 버퍼의 모든 데이터를 가져온다
		
		int n3, n4;
		
		System.out.print("다시 두 정수 입력 : ");
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		
		System.out.printf("n3 = %d, n4 = %d\n",n3,n4);
		
		sc.close();
	}
								
}
