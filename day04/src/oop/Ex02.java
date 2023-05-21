package oop;

class Person {
	//1 필드 : 멤버변수 . 객체의 속성
	String name;
	int age;
	double height;
	
	//2.메서드 : 멤버 함수. 객체의 기능
	void run() {
		/// void run(Person this)
		System.out.println(name + "(이)가 달린다");
		System.out.println(this.name + "(이)가 달린다.");
		//- this는 지역변수와 이름이 겹치지만 않으면 생략가능하다.
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person();
		//참조변수 = 인스턴스;
		//참조(reference) : 어떠한 대상을 가리키는 것을 의미한다. 
		
		per.name = "임지훈";
		per.age = 28;
		per.height = 173.0;
		
		System.out.println("per = "+ per + "\n");
		//참조 변수를 바로 출력하면 '해시코드'라는 값이 출력된다.
		// - 해시코드는 인스턴스를 구분하기 위한 값(= ID)
		
		System.out.println("per 이름 : " + per.name);
		System.out.println("per 나이 : " + per.age);
		System.out.println("per 신장 : " + per.height+"\n");
		
		per.run();

		
		
	}

}
