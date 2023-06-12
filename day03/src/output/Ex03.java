package output;

public class Ex03 {
	public static void main(String[] args) {
		// 이스케이프 시퀀스
		// 출력 시 모양으로 나타나지는 않으나 특수한 기능을 수행하는 글자
		
		char cr = '\r';	
		// carrige return : 커서를 줄 가장 왼쪽으로 이동시킨다
		
		char lf = '\n';	
		// line feed : 커서를 한줄 아래로 이동시킨다
		
		char tab = '\t';
		// tab : 프로그램에서 지정한 탭 크기(4 or 8)만큼 우측으로 이동시킨다
		
		char bs = '\b';
		// backspace : 커서를 왼쪽으로 한칸 이동시킨다
		
		System.out.printf("cr : %d\n", (int)cr);	// 13 (Enter)
		System.out.printf("lf : %d\n", (int)lf);	// 10 (Enter)
		System.out.printf("tab : %d\n", (int)tab);	// 9
		System.out.printf("bs : %d\n", (int)bs);	// 8
		System.out.println();
		
		System.out.println("A_" + cr + "B");	
		System.out.println("C_" + lf + "D");
		System.out.println("E_" + tab + "F");
		System.out.println("G_" + bs + "H");
		
		System.out.println("원빈\t: 45세");
		System.out.println("마동석\t: 모름");
		System.out.println("두아리파\t: 모름");
		System.out.println("저스틴비버\t: 모름");
		System.out.println("아리아나그란데\t: 30세");
		
		// backslash : 특수 글자의 앞에 붙어서 기능을 제거하는 역할을 한다
		System.out.println("쌍따옴표 (\")");
		System.out.println("개행문자 (\\n)");
		System.out.printf("%d %% \n", 120);
		
	}

}
