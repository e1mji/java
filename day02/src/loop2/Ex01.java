package loop2;

public class Ex01 {
	public static void main(String[] args) {
		// ��ø�ݺ���
		// - �ݺ��� �ȿ� �ݺ����� �����ϴ� ���
		for(int i=1; i<=3; i++) {		// �ٱ� for�� : ��ݺ�
									
			for (int j=1;  j<=5; j++) {	// ���� for�� : �� �ݺ� 
				System.out.print(j+" ");
			}
			System.out.println();						
		}
		
		//������ �ؼ� :
		//�ٱ� for���� ��ݺ��̹Ƿ� 3���� �����ڴٴ� �ǹ��̴�.
		//���� for���� �� �ݺ��̴�.�׷��ϱ� ù��° �ݺ� 1 2 3 4 5 �������� 
		//�ٽ� �ٱ�for���� ��������i�� 2���Ǿ �ι�° �ٿ��� 1 2 3 4 5�� ����Ѵ�.
	}

}
