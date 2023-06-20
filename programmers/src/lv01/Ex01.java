package lv01;

import java.util.Arrays;

public class Ex01 {		//민우의 로또번호		//로또 당첨번호
    static int[] solution(int[] lottos, int[] win_nums) {
    	// 최고순위와 최저순위의 변수 초기화
    	int number =0;
    	int count =0;
    	for (int i =0; i<lottos.length; i++) {
    		// 만약 지워진 로또번호가 6개라면  
    		if(lottos[i] == 0) {
    			// 6개만큼 카운트
    			number++;
    		} else {
    			for(int j =0; j<win_nums.length; j++) {
    				// 만약 민우의 로또번호[i]와 당첨번호[j]가 같다면.
    				if(lottos[i] == win_nums[j]) {
    					//맞춘개수 카운트 
    					count++;
    					break;
    				}
    			}
    		}
    	}
    	// answer배열은 , 함수 (맞춘개수 + 0의 개수 ), rank (등수)
    	int[] answer = {rank(count+number),rank(count)};
        return answer;
    }
    //맞춘 카운트만큼 등수로 반환하는 함수.
    static int rank(int count) {
    	switch(count) {
    	case 6 : 	return 1;
    	case 5 : 	return 2;
    	case 4 : 	return 3;
    	case 3 : 	return 4;
    	case 2 : 	return 5;
    	default :	 return 6;

    	}
    }
    
	public static void main(String[] args) {
		//민우의 로또번호 입력 
		int[] lottos = {44,1,0,0,31,25};
		//당첨번호
		int[] win_nums = {31,10,45,1,6,19};
		
		int[] a = solution(lottos, win_nums);
		System.out.println(Arrays.toString(a));
		
	}
}
