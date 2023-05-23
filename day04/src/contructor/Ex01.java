package contructor;
/*
 * 생성자  : 클래스의 이름과 동일한 이름을 가진 메서드
 * - 인스턴스 생성시 한번만 호출된다
 * - 주로, 클래스의 멤버를 초기화 하는 용도로 사용된다.
 *  - 반환형을 작성하면 안된다.
 *  
 *  기본생성자 : 사용자가 생성자를 작성하지 않으면 자동으로 만들어지는 생성자
 *  -사용자가 하나이상의 생성자를 직접 작성하면 만들어지지 않는다. 
 */

class Person {
	// 클래스의 필드는 초기화 하지 않으면 기본값으로 자동 초기화 됨 
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;	//필드명과 지역변수명이 같으면 지역변수가 우선시된다.
		this.age = age;		//따라서 필드를 의미하려면 this를 꼭 붙여야된다.
	}
	Person(){
		name = "미정";
		age = -1;
	}
	
	void show() {
		System.out.printf("%s (%d세)\n",name,age);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("김진호", 30);
		
		p1.show();
		p2.show();
		
	}

	

}
