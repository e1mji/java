package operator;

public class Ex05 {
	public static void main(String[] args) {
		//�������� : ��/������ ����
		
		//1. && : AND, ���ʸ�� ���̸� ����� ��
		System.out.println("true AND true ��� : " + (true && true));
		System.out.println("true  AND false ��� : " + (true && false));
		System.out.println("false AND true  ��� : " + (false && true));
		System.out.println("false AND false ��� : " + (false && false));
		System.out.println();		
		//�� ������ �ڵ�� �����ڵ�� �� ��2���ڵ忡�� �̹� �Ǻ��� �������ȱ⿡ �ǹ̰�����.
													
		
		// 2. || : OR, ���� ��� �����̸� ����� ����
		System.out.println("true  OR true  ��� : " + (true || true));
		System.out.println("true  OR false ��� : " + (true || false));
		System.out.println("false OR true  ��� : " + (false || true));
		System.out.println("false OR false ��� : " + (false || false));
		System.out.println();
				//���������� ��2���ڵ�� �����ڵ� or�� ���ʸ� ���̸� ���̹Ƿ� 
		
		// 3. ! : NOT, ���� �������� ������ ������
		System.out.println("NOT true  ��� : " + !true);
		System.out.println("NOT false ��� : " + !false);
	}

}
