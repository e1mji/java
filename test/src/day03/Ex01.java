package day03;


class Human {
	String name;
	
	Human(String name) {
		this.name = name;
	}
	
	public void show() {
		System.out.println("이름 : " + name);
	}
}

class Student extends Human{
	String school;
	
	public Student(String name,String school) {
		super(name);
		this.school = school;
	}
	
	@Override
	public void show() {
		System.out.printf("이름 : %s, 소속 : %s\n",name,school);
	}
}


class Actor extends Human{
	String drama;
	public Actor(String name, String drama) {
		super(name);
		this.drama = drama;
	}
	
	@Override
	public void show() {
		System.out.printf("이름 :%s, 출연작 : %s\n",name,drama);
	}
	
}

class Car {
	
	Human[] seat = new Human[4];
	
	void entrance(Human ob) {
		for(int i=0; i<seat.length; i++) {
			if(seat[i] == null) {
				seat[i]=ob;
				return;
			}
		}
		System.out.println(ob.name+"님 자리가 꽉찼습니다.");
	}	
	
	void searchPeople() {
		for(int i=0; i<seat.length; i++) {
			if(seat[i] != null) {
				seat[i].show();			
			}
		}
	}
	
}

public class Ex01 {
	public static void main(String[] args) { 
		Car car = new Car();
		Student st1 = new Student("이이경", "kGITBANK");
		Student st2 = new Student("데프콘", "KGITBANK");
		Actor ac1 = new Actor("송혜교", "더글로리");
		Actor ac2 = new Actor("티모시샬라메", "듄");
		Human driver = new Human("한문철");
		
		car.entrance(st1);
		car.entrance(ac1);
		car.entrance(ac2);
		car.entrance(driver);
		car.entrance(st2);
		
		car.searchPeople();
		
	}

}
