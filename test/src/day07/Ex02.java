package day07;

public class Ex02 {
	
    static int solution(int balls, int share) {
    	//만약 머쓱이가 가지고있는 구슬이 친구한테 나눠줄 구슬보다 적다면 0
        if (balls < share) return 0;
        
        int son = 1;	 //분자	
        int mom = 1;	//분모
        
        // 머쓱이가 5개를 가지고 있고 친구한테 3개 나누어준다고 가정하면 분자는 5x4x3
        for(int i=balls; i>balls-share; i--) {
        	son *=i;
        }
        // 분모는 3x2x1
        for (int i = share; i>1; i--) {
        	mom *=i;
        }
        // 60 / 6	
        int answer = son/mom;
        
        return answer ;
    }
	public static void main(String[] args) {
		int balls = 5;
		int share = 3;
		int answer = solution(balls, share);
		System.out.println(answer);
		
	}

}
