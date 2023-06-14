package day08;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		// 사용자에게 1 ~ 100 사이 정수를 입력받아서
		// 전체 길이에서 입력한 수치 이전은 #을 출력하고
		// 이후는 공백을 출력한다
		// 단, 항상 가운데에는 입력한 수치를 % 형태로 출력해야 한다

		// [########## 20 % 										]
		// [######################### 50 % 							]
		// [######################### 67 % ########					]
		// [######################### 75 % ############ 			]

		Scanner sc = new Scanner(System.in);
		int n,half;

		System.out.print("정수입력(1~100)");
		n = sc.nextInt();
		half = n/2;
		System.out.print("[");
		for (int i = 0; i < 50; i++) {	//#혹은 공백을 출력하는 전체칸은 50칸
			if (i == 25) {				//만약 i가 25가 되면 몇퍼센트를 입력받았는지 출력
				System.out.printf(" %2d %% ",n);
			}
			else if(i<half) {			//i가  입력값의 절반보다 작으면 #
					System.out.print("#");
			}
			else {						//i가 입력값의 절반보다 크거나 같으면 공백 
				System.out.print(" ");
			}
		}
		System.out.println("]\n");
		sc.close();

		}

	}


