package loop;

public class Ex06 {
	public static void main(String[] args) {
		//��������
		//-Ư�� ���� �ȿ��� ������ ����
		//- �ش翵���� ������ �޸𸮻󿡼� ���ŵȴ�
		
		for (int i=1; i<=5; i++) {
			System.out.println(i+":Hello World!!");
		}					
		System.out.println();
		
		//System.out.println("�ݺ��� i = " + i);
		// -i�� for������ ����� ��������
		// -���� for���� ������ �������.
		
		int j;
		
		for (j=1; j<=5; j++) {
			System.out.println(j+":Hello World!!!");			
		}
		System.out.println("�ݺ� �� j = "+ j );
		//j�� �������� �� main���� �ۼ��� ��������
		//main�� �������������� ��������ʴ´�
		//main = ��� �ڹ����α׷��� main�޼��忡�� ���۵ȴ�. 
		//���α׷��� ����Ǹ� �ڹٰ���ӽ�(JVM)�� main�޼��带 ã�� �����Ѵ�.
	}

}
