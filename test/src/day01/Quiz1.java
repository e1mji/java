package day01;

public class Quiz1 {
	//String s = String.format("%2d: %2d",hour,minute);
	// 1) 정거장 구간 수에 따른 걸린 시간을 문자열로 반환하기
	// (구간당 4분으로 계산하며, 60분을 초과하면 시간과 분으로 구분하여 반환하기)
	static String quiz1(int n) {
		int total = n *4;
		int hour=0;
		int minute =0;
		
		if(total>=60) {
			hour = total/60;
			minute = total%60;
		}
		else {
			minute=total;
		}
		String s;
		s=String.format("%2d 시간 %2d분 ", hour,minute);
		
		return s;	
	}
	// 2) 놀이기구 이용 시간에 따른 요금을 문자열로 반환하기
	// 기본 30분까지는 3천원, 이후 10분당 500원의 추가 요금 발생
	// (천단위 구분기호를 찍어서 처리해야함)
		static String quiz2(int time) {
			String s;
			int st = 3000;
			int add =0;
			if(time>30) {
				add = st+500+ (( (time-31)/10) * 500);
			}
			else if (time<=30) {
				add=3000;
			}
			s=String.format("%,d",add);
			return s;
		}
	
		// 3) 두 정수를 전달받아서, 두 정수 사이의 모든 수의 합을 구하여 반환하기
		// (두 정수의 대소관계는 정해져있지 않음)
		
		static int quiz3(int n1,int n2) {
			int answer=0;
		
			//두수의 대소관계에 따라 	새로운 변수를 대입하거나  값을 바꾼다.
			if(n1>n2) {
				int tmp = n1;
				n1=n2;
				n2=tmp;
			}
			for(int i=0; i<=n2; i++) {
				answer+=i;
			}
			return answer;
		}
	
	
	public static void main(String[] args) {
		String s1 = quiz1(12);
		String s2 = quiz1(16);
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		String s3 = quiz2(25);
		String s4 = quiz2(40);
		String s5 = quiz2(41);
//		
		
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		System.out.println("s5 : " + s5);
//		
		int n1 = quiz3(1,10);
		int n2 = quiz3(10,1);
//		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
//		
		
	}

}
