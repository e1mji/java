package day08;

public class Ex01 {
	public static void main(String[] args) {
		// 다음 모양의 문자열을 만들어서 화면에 출력하세요
		
		// 123456789012345678901234
		// ====*====*====*====*====
		String str = "";
		for(int i =1; i<25; i++) {
			//만약 i가 를 5로나눠서 나머지가 1이남으면 ====를한번만출력한다.
			if(i%5==1) str += "====";
			//만약 i가 5로나눠서 0으로 떨어지면 * 출력 
			else if(i%5==0) {
				str+="*";
			}
		}
		System.out.println("str : " +str);
		
		//강사님 코드
		String str2 = "";
		
		for(int i = 1; i < 25; i++) {
			if(i % 5 == 0) {
				str2 += "*";
			}
			else {
				str2 += "=";
			}
		}
		System.out.println("str2 : "+str2);
		
		String str3 = "";
		for(int i = 0; i < 5; i++) {
			str3 += "====";
			if(i != 4) {		// 마지막 순번이 아니면
				str3 += "*";	// *을 추가한다
			}
		}
		System.out.println("str3 : "+str3);
							
	}

}
