package contructor;
/*
 * ������  : Ŭ������ �̸��� ������ �̸��� ���� �޼���
 * - �ν��Ͻ� ������ �ѹ��� ȣ��ȴ�
 * - �ַ�, Ŭ������ ����� �ʱ�ȭ �ϴ� �뵵�� ���ȴ�.
 *  - ��ȯ���� �ۼ��ϸ� �ȵȴ�.
 *  
 *  �⺻������ : ����ڰ� �����ڸ� �ۼ����� ������ �ڵ����� ��������� ������
 *  -����ڰ� �ϳ��̻��� �����ڸ� ���� �ۼ��ϸ� ��������� �ʴ´�. 
 */

class Person {
	// Ŭ������ �ʵ�� �ʱ�ȭ ���� ������ �⺻������ �ڵ� �ʱ�ȭ �� 
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;	//�ʵ��� ������������ ������ ���������� �켱�õȴ�.
		this.age = age;		//���� �ʵ带 �ǹ��Ϸ��� this�� �� �ٿ��ߵȴ�.
	}
	Person(){
		name = "����";
		age = -1;
	}
	
	void show() {
		System.out.printf("%s (%d��)\n",name,age);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("����ȣ", 30);
		
		p1.show();
		p2.show();
		
	}

	

}
