package method;

public class Ex03 {
	//�Ű��������� �������ڰ� ������� ä������ 
	static void adder(int n1, int n2) {
		System.out.printf("n1 = %d, n2 = %d\n",n1,n2);
		
		System.out.println("n1 + n2 = "+ (n1 + n2) + "\n");
	}
	
	public static void main(String[] args) {
		adder(5,3);
		
		adder(3,5);
		
		//�߸��� �����
		// adder(5);	//�������� ����
		// adder(5, 3, 1);	//�Ű����� ����
		// adder (5,3.0); 	//�ڷ��� ����ġ
	}

}
