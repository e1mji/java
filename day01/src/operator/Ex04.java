package operator;

public class Ex04 {
	public static void main(String[] args) {
		// �� ������ : �������� ��� ���踦 ��
		// - �� ����� boolean. ��, ��/����
		
		int n = 10;
		
		System.out.println("n > 5 ��� : " + (n > 5));
		System.out.println("n < 10 ��� : " + (n < 10));
		
		System.out.println("n <= 10 ��� : " + (n <= 10));
		System.out.println("n >= 5 ��� : " + (n >= 5));
		
		System.out.println("n == 10 ��� : " + (n == 10));	// ������ ��, �ٸ��� ����
		System.out.println("n != 10 ��� : " + (n != 10));	// ������ ����, �ٸ��� ��
		
		
		// ���� ����� boolean Ÿ���� ������ ���� ����
		boolean result = (10 == 11);
		
		System.out.println("\nresult = " + result);
	}

}
