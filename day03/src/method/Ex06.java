package method;

//�޼��� �����ε�(overloading)
// - ���� �̸��� �޼��带 ������ �ۼ��ϴ� ���
// - �޼����� �̸��� ���ƾ��ϰ�, �Ű����� ���°� �޶�� �Ѵ�.

public class Ex06 {
	
	static int adder(int n1, int n2) {
		return n1+n2;
	}
	
	static int adder(int n) {
		return n + 10;
	}
	
	static double adder(double n) {
		return n +3.14;
	}
	
	static int adder() {
		return 10+ 20;
	}
	
	public static void main(String[] args) {
		
		System.out.println("��� : " + adder(5,3));
		System.out.println("��� : " + adder(5));
		System.out.println("��� : " + adder(5.0));
		System.out.println("��� : " + adder());
		
		
	}
	

}
