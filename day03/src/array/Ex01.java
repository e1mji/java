package array;

public class Ex01 {
	public static void main(String[] args) {
		//�Ϲ� �ڷ���
		int n=10;
		//�����ڷ��� : []�� ���� �迭�� ���� Ÿ���̴�(#pythonTutor����)
		// - �ڵ����� ������ ��� �����͸� ����Ű�� ���� �ǹ��Ѵ�.
		//						0  1  2	 3  4  (=index.������ȣ)
		int[] arr = new int[] {10,20,30,40,50};
		
		System.out.println("n = "+ n);
		System.out.println("arr = "+ arr+"\n");
		// -���� ������ ���� ����ϸ� '�ؽ��ڵ�'��� �̻��� ���� ��µȴ�
		// - �ؽ��ڵ�� �������� '������ȣ(=�ֹε�Ϲ�ȣ)'��� �����ϸ� ����
		
		System.out.println("arr[0] = "+ arr[0]);
		System.out.println("arr[0] = "+ arr[1]);
		System.out.println("arr[0] = "+ arr[4]);
		
		// - �迭�� ����� �����͸� '���(= elements)" ��� �Ѵ�
		// - ��Ҹ� �����Ϸ��� ���������� index�� �ʿ��ϴ�.
		
		//System.out.println("arr[5] = "+ arr[5]);
		// -������ �ʰ��ϴ� ������ ����~ 5���� �ε����� ���⶧��.
	}

}
