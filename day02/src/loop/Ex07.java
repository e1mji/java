package loop;

public class Ex07 {
	public static void main(String[] args) {
		//���� ���
		//break : ����� '���' �����Ų��.
		for(int i=1; i<=10; i++) {
			if(i == 5) {
				break;
			}
			System.out.print(i+ "");
		}
		System.out.println();
		
		//2. continue : ����� '���'ó������
		for (int i=1; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	//������ �ؼ�
	// for�������� ��������i�� 10�� �ɶ����� �����ϸ�
	// ���ӹ����� �����ϱ�� �Ǿ��ִ�
	// ���⼭ if���ǹ����� ���� i�� 5�� �ɶ�
	// break�� ��ùݺ����� �������´�.=> 1234
	
	//continue�� ����� ���ó������ �ǵ����⿡ 
	//���� i�� 5���Ǹ� ��¹����� �Ѿ���ʰ� �ٽ� ó������ �ǵ��ư���
	//���ǽ��� �����Ѵ�. =>1234 678910

}
