package loop;

public class Quiz2 {
	public static void main(String[] args) {
		// 1���� 1000������ ���� ���µ� 
		// 3�� 5��  ����� �հ迡 ���Խ�Ű�� 3�ǹ���� �ǳʶٱ�
		int sum = 0;
		
		for(int i =1; i<=1000; i++) {
			if(i%3 == 0 && i%5==0) {
				//����� �� ���� ��ü�� �ǹ̰� �ִ�~
			}
			else if(i%3 == 0) {
				continue;
			}
			sum += i;
			
			//����� �ڵ� : �ڵ��� ���Ἲ�� �����ϴ� ��� ������ �ǹ��Ѵ�.
			System.out.printf("i=%d, sum = %d\n",i,sum);
		}
		System.out.println("��� : " + sum);
	}

}
