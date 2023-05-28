package oop;

class Student{
	String name;
	int kor,eng,mat;
	
	void showStu() {
		String result = "%s (국%d, 영%d, 수%d)\n";
		
		System.out.printf(result,name,kor,eng,mat);
	}
	
	int total() {
		return kor + eng + mat;
	}
	
	
}

public class Quiz {
	public static void main(String[] args) {
		// 아래코드가 실행되게 클래스를 작성해 보세요
		Student stu = new Student();
		
		stu.name = "김진수";
		stu.kor = 70;
		stu.eng = 80;
		stu.mat = 90;
		
		stu.showStu();
		
		System.out.println("stu 합계 :" + stu.total());
		
		//나만의 해석:
		//Student stu 는 인스턴스다.
		//Student클래스를 생성해주고 멤버필드를 정의해주고
		//멤버 함수를 이용해서  김진수의 국,영,수를 출ㄹ
		
		
		
	}

}
