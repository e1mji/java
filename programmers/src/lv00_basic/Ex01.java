package lv00_basic;

/*
 * my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
 * 문자열 my_string이 매개변수로 주어질 때, 
 * 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 */
public class Ex01 {
	//코딩 테스트 입문 (문자열 계산하기)
	  static int solution(String my_string) {
	    	int answer = 0;
	    	//arr 배열 변수는 my_string배열에서 공백을 날린다.
	    	String[] arr =  my_string.split(" ");
	    	//answer는 arr배열변수의 0번째 값을 정수로 바꾼다.
	    	answer = Integer.parseInt(arr[0]);
	    	//반복문으로 arr변수를 순회하면서
	    	for(int i =0; i<arr.length; i++) {

	    		//i가 홀수일때 , 즉( 인덱스값 1,3,5,7)이면서 
	        	if(i%2!= 0) {
	        		//arr의 i가 +와 일치하면 
		    		if(arr[i].equals("+")) {
		    			//i+1번째 요소를 answer에 더해주고 
		    			answer +=  Integer.parseInt(arr[i+1]);
		    		}
		    		//arr의 i가 -와 일치하면 
		    		else if (arr[i].equals("-")) {
		    			// answer에 빼준다.
		    			answer -= Integer.parseInt(arr[i+1]);
		    		}
		    	}
	    	}
	    	//결과 반환
	    	return answer;
	  }
	  
	public static void main(String[] args) {
		String my_string = "3 + 4";
		System.out.println(solution(my_string));
		
	}

}
