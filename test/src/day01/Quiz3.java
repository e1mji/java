package day01;

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
	
	

}
