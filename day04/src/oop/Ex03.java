package oop;

//class Person{
//	클래스는 같은 패키지에 공유가 된다
//}

public class Ex03 {
	public static void main(String[] args) {
		
		//인스턴스는 여러개 생성이 가능하다.
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "홍길동";
		p2.name = "김진호";
		
		p1.run(); //run(p1) -> this = p1;
		p2.run(); //run(p1) -> this = p1;
		
		//즉, this는 인스턴스를 구분하기 위해서 사용된다.
		
	}

}
