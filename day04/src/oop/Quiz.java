package oop;

class Student{
	String name;
	int kor,eng,mat;
	
	void showStu() {
		String result = "%s (��%d, ��%d, ��%d)\n";
		
		System.out.printf(result,name,kor,eng,mat);
	}
	
	int total() {
		return kor + eng + mat;
	}
	
	
}

public class Quiz {
	public static void main(String[] args) {
		// �Ʒ��ڵ尡 ����ǰ� Ŭ������ �ۼ��� ������
		Student stu = new Student();
		
		stu.name = "������";
		stu.kor = 70;
		stu.eng = 80;
		stu.mat = 90;
		
		stu.showStu();
		
		System.out.println("stu �հ� :" + stu.total());
		
		//������ �ؼ�:
		
		
		
	}

}
