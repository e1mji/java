package oop;

//class Person{
//	Ŭ������ ���� ��Ű���� ������ �ȴ�
//}

public class Ex03 {
	public static void main(String[] args) {
		
		//�ν��Ͻ��� ������ ������ �����ϴ�.
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.name = "ȫ�浿";
		p2.name = "����ȣ";
		
		p1.run(); //run(p1) -> this = p1;
		p2.run(); //run(p1) -> this = p1;
		
		//��, this�� �ν��Ͻ��� �����ϱ� ���ؼ� ���ȴ�.
		
	}

}
