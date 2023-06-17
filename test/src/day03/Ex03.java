package day03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = ran.nextInt(15) +1;
		}
		System.out.println(Arrays.toString(arr));
		// 3대의 엘리베이터가 있다
		// 사용자에게 현재 층수를 입력받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘리베이터의 이름을 A, B, C라고 하면
		// "%s 엘리베이터가 이동합니다" 라고 출력해야 합니다
		// Ex04에서 작성했던 함수를 참조하여, 활용하면 좋습니다
		
		int curretnFloor;
		System.out.print("현재  층 입력 : ");
		curretnFloor = sc.nextInt();
		
		int min = 14;	//최소값을 구하기 위해서는 이론상의 최대값을 넣어두고 시작
		int index = 0;
		
		//
		for(int i  = 0; i<arr.length; i++) {
			int diff = getAbsolute(arr[i] - curretnFloor);
			if(min> diff) {
				min  = diff;
				index = i;
			}
			System.out.println(diff +  " ");
		}
		System.out.println();
		System.out.println((char)(index + 'A') + "엘리베이터가 이동합니다. ");
	}
	static char getNearElebatorName(int[] arr, int currentFloor) {
		char ele = 'A';
		int index = 0;
		int min =14;
		
		//현재 층과 각 엘리베이터의 차이 구하기 
		for(int i =0; i<arr.length; i++) {
			int diff = arr[i] -currentFloor;
			
			// 2) 차이에 절대 값 처리하기 (거리)
			
			if(diff<0) {
				diff = -diff;
			}
			//3) 거리중 최소값을 찾아서 index 구하기 
			if(min > diff) {
				min = diff;
				index =i;
			}
		}
		// 4) index를 ele에 더하고 반환하기
		ele += index;
		return ele;
	}
	static int getAbsolute(int num) {
		return num > 0 ? num : - num;
	}

}
