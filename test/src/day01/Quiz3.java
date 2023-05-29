package day01;

<<<<<<< HEAD
public class Quiz3 {
	static String[] solution(String myStr, int n) {
	    // 배열의 길이 계산
	    int arrayLength = myStr.length() / n;
	    if (myStr.length() % n != 0) {
	        arrayLength++;
	    }
	    // 결과를 저장할 배열 생성
	    String[] result = new String[arrayLength];

	    // 문자열을 n씩 잘라서 배열에 저장
	    for (int i = 0; i < arrayLength; i++) {
	        // 잘라낼 부분 문자열의 시작 인덱스 계산
	        int startIndex = i * n;
	        // 잘라낼 부분 문자열의 종료 인덱스 계산
	        int endIndex = startIndex + n;
	        
	        // 만약 종료 인덱스가 문자열 길이를 초과하는 경우, 종료 인덱스를 문자열 길이로 조정
	        if (endIndex > myStr.length()) {
	            endIndex = myStr.length();
	        }
	        // 부분 문자열을 추출하여 결과 배열에 저장
	        result[i] = myStr.substring(startIndex, endIndex);
	    }

	    // 결과 배열 반환
	    return result;
	}
	public static void main(String[] args) {
		
		String str = "abc1Addfggg4556b";
		
		int n=6;
		
		String[] s1 = solution(str,n);
		
		for(String s : s1) {
			System.out.println(s);
		}

	}
=======
/*
 * "abc1Addfggg4556b" 를 길이 6씩 잘라 배열에 저장한 
 * ["abc1Ad", "dfggg4", "556b"]를 return해야 합니다.
	입출력 예 #2

"	abcdef123" 를 길이 3씩 잘라 배열에 저장한 ["abc", "def", "123"]를 return해야 합니다.

 */

//		문자열 my_str과 n이 매개변수로 주어질 때,
//		my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

public class Quiz3 {
	public static void main(String[] args) {
		String my_str = "abc1Addfggg4556b";
		
		int n=6;
		
		String[] result = solution(my_str, n);
		for(String str : result) {
			System.out.println(str);
		}
	}
	
	public static String[] solution(String my_str, int n) {
		int length = my_str.length()/n;
		
		if(my_str.length()% n!= 0) {
			length++;
		}
		String[] result = new String[length];
		
		for(int i=0; i<length; i++) {
			int startIndex = i*n;
			int endIndex = startIndex +n;
			
			if(endIndex > my_str.length()) {
				endIndex = my_str.length();
			}
			result[i] = my_str.substring(startIndex, endIndex);
		}
		
		return result;
	}
	
	
>>>>>>> e1mji

}
