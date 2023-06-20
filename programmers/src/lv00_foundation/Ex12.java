package lv00_foundation;

/*
	 * ineq	eq	n	m	result
		"<"	"="	20	50	1
		">"	"!"	41	78	0
	
	입출력 예 설명
	입출력 예 #1
	
	20 <= 50은 참이기 때문에 1을 return합니다.
	입출력 예 #2

	41 > 78은 거짓이기 때문에 0을 return합니다.
	
	두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, 
	eq는 "="와 "!"중 하나입니다. 
	그리고 두 정수 n과 m이 주어질 때, 
	n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class Ex12 {
   static int solution(String ineq, String eq, int n, int m) {
       int answer = 0;
       // ineq가 "<"와 같으면서 n < m 이면 
       if (ineq.equals("<") && n<m) {
    	   // 1 리턴 
    	   answer =1;
       }
       // 나머지도 마찬가지 
       else if (ineq.equals(">") && n>m) {
    	   answer =1;
       }
       else if (eq.equals("=") && n==m) {
    	   answer =1;
       }
       else if (eq.equals("!=") && n != m) {
    	   answer = 1;
       }
  
       return answer;
    }
	public static void main(String[] args) {
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		System.out.println(solution(ineq, eq, n, m));

	}

}
