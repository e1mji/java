package lv00_basic;

import java.math.BigInteger;

public class Ex02 {
		//코딩 테스트 입문 구슬나누기
    static BigInteger  solution(int balls, int share) {
    	//만약 머쓱이가 가지고있는 구슬이 친구한테 나눠줄 구슬보다 적다면 0
        if (balls < share) return BigInteger.ZERO;
        BigInteger son = BigInteger.ONE;	 //분자	
        BigInteger mom = BigInteger.ONE;	//분모
        
        // 머쓱이가 5개를 가지고 있고 친구한테 3개 나누어준다고 가정하면 분자는 5x4x3
        for(int i=balls; i>balls-share; i--) {
        	son = son.multiply(BigInteger.valueOf(i));
        }
        // 분모는 3x2x1
        for (int i = share; i>=2; i--) {
        	mom = mom.multiply(BigInteger.valueOf(i));
        }
        // 60 / 6	
        BigInteger answer = son.divide(mom);
        
        return  answer;
    }

	public static void main(String[] args) {
		int balls = 5;
		int share = 3;
		BigInteger answer = solution(balls, share);
		System.out.println(answer);
		
	}

}
