package loop;

public class Quiz4 {
	public static void main(String[] args) {
		//ù���� 1���� �����ϰ� ���� 2�辿 ���������� 30���� ����� 
		int money =1;
		int total =0;
		
		for(int i=1; i<=30; i++) {
			total += money;
			
			//�����)
			System.out.printf("%d��) ���� : %d��, ���� :%d��\n",i,money,total);
			money *=2;
		}
		System.out.println("�Ѿ� : " + total + "��");
		
	}
	//������ �ؼ�:
	//money�� ���� �ʱⰪ�� 1�̴�. �������� i�� �ʱⰪ�� 1�̰� 30�ϱ��� ������Ų��.
	//total�� ������ 0���� �ʱ�ȭ�����ش�. for���� ���� 1�������� �ɶ�����
	//money������ ���մ��Կ����ڷ� 2�辿 �����ش�. 
	//total �� 10��7õ������ ���ݵȴ�.

}
