package lv00_foundation;

public class Ex01 {
		//코딩 기초 트레이닝 (q,r코드)
	    static String solution(int q, int r, String code) {
	    	String answer = "";
	    	for(int i =0; i<code.length(); i++) {
	    		//i의 요소가 q와 나눈 값이 r과 일치하면 
	    		if(i % q == r) {
	    			//answer에 code의 i값을 빼서 추가 
	    			answer +=code.charAt(i);
	    		}
	    	}
	    	
	    	return answer;
	}
	public static void main(String[] args) {
		int q=3;
		int r=1;
		String code = "alsdodfl";
		String s1 = solution(q, r, code);
		System.out.println(s1);
	}
}
