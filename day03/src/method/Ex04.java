package method;
/*
 * �޼����� ����
 * 1.��ȯ ���� ���� �޼��� : void�� �޼���
 * - �ڵ带 ���ุ �� �� �����ִ� ��� ���� ���� �޼���
 * 
 * 2. ��ȯ���� �ִ� �޼��� : �ڷ����� �ִ� �޼���
 * -�ڵ带 �����ϰ� ���� ����� �����ִ� �޼���
 */

public class Ex04 {
	
	//void�� �޼��� 
	static void adder1(int n1, int n2) {
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n",n1,n2,sum);
	}
	
	//int�� �޼���
	static int adder2(int n1, int n2) {
		int sum = n1 + n2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		//void�� �޼���� �����ִ� ����� �����Ƿ� �̸��� ȣ���ؼ� ���
		adder1(5,3);
		
		//int�� �޼���� ������ ����� �����ֱ� ������, 1. ������ �����ϰų�
		int result = adder2(5,3);
		
		System.out.println("result = " + result);
		
		// 2. �ٸ� �޼����� ���ް����� �ٷ� ����Ѵ� 
		System.out.println("adder(7,2) = " + adder2(7,2));
		
		//����)
		int n = adder2(adder2(5,1), adder2(9,2));
		
		System.out.println("n : " + n);
		
	}

}
