package basic;

import java.util.Scanner;

//  지정된 아이디와 패스워드가 일치하면 로그인성공을 출력
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = "itbank";
		String pw = "it";
		
		String userid,userpw;
		
		System.out.print("아이디입력 : ");
		userid = sc.nextLine();
		
		System.out.print("pw입력 : ");
		userpw = sc.nextLine();
		
		if(userid.equals(id)) {
			if(userpw.equals(pw)) {
				System.out.println("로그인성공");
			} else {
				System.out.println("비밀번호 오류 ");
			}
		}
		else {
			System.out.println("일치하는 계정이 없습니다.");
		}
		
		sc.close();
		

	}

}
