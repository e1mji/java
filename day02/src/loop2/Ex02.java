package loop2;

public class Ex02 {
	public static void main(String[] args) {
		//1. ������ 2���� ���Ϲݺ����� ���. �� x1 ~ x9����
		//2. 1���� ��ø �ݺ����� ���� 2���� 8�� ����Ѵ�
		//3. 2���� ������ ���� �����ؼ� ������ 2��~9�ܱ��� ��� ����Ѵ�.
		
		//1. ������2���� ���Ϲݺ�����ϱ� 
		for(int i=1; i<=9; i++) {
			System.out.printf("2x%d=%d\n",i,2*i);
		}
		
		System.out.println();
		
		//2.1���� ��ø�ݺ����� �ݵ� 2���� 8�� ����ϱ� 
		for(int i=1; i<=8; i++) {
			for(int j=1; j<=9; j++) {
			System.out.printf("2x%d=%d\n",j,2*j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//3.2���� ������ ���� �����ؼ� ������ 2��~9�ܱ��� ��� ����Ѵ�.
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
			System.out.printf("%dx%d=%d\n",i,j,i*j);
			}
			System.out.println();
		}
		
		//������ �ؼ�:
		// ���� i�� j�� 9�� �Ǳ������� 2�̴� �׷��Ƿ� 
		// 2���� ����ϰ�, i�� �ϳ��������Ǹ鼭 9�ܱ��� ����Ѵ�.
	}											

}
