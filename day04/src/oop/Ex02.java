package oop;

class Person {
	//1 �ʵ� : ������� . ��ü�� �Ӽ�
	String name;
	int age;
	double height;
	
	//2.�޼��� : ��� �Լ�. ��ü�� ���
	void run() {
		/// void run(Person this)
		System.out.println(name + "(��)�� �޸���");
		System.out.println(this.name + "(��)�� �޸���.");
		//- this�� ���������� �̸��� ��ġ���� ������ ���������ϴ�.
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Person per = new Person();
		//�������� = �ν��Ͻ�;
		//����(reference) : ��� ����� ����Ű�� ���� �ǹ��Ѵ�. 
		
		per.name = "������";
		per.age = 28;
		per.height = 173.0;
		
		System.out.println("per = "+ per + "\n");
		//���� ������ �ٷ� ����ϸ� '�ؽ��ڵ�'��� ���� ��µȴ�.
		// - �ؽ��ڵ�� �ν��Ͻ��� �����ϱ� ���� ��(= ID)
		
		System.out.println("per �̸� : " + per.name);
		System.out.println("per ���� : " + per.age);
		System.out.println("per ���� : " + per.height+"\n");
		
		per.run();

		
		
	}

}
