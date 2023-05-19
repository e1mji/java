package method;

public class Quiz {
	
	//1. 1~n���� �Ϸķ� ����ϴ� �Լ�
	static void printNumber(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(i+"");
		}
		System.out.println();
	}
	
	// 2. 1~n������ �հ踦 ���ϴ� �Լ� 
	static int total(int n) {
		int result = 0;
		
		for (int i = 1; i<=n; i++) {
			result +=i;
		}
		
		return result;
	}
	
	//3. �迭���� �ִ밪�� ��ȯ�ϴ� �Լ�
	static int maxArr(int[] arr) {
		int mx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(mx <arr[i]) {
				mx = arr[i];
			}
		}
		return mx;
	}
	
	// �Ųٷι�ȯ�ϴ� �Լ� 
	static int reverse(int n) {
		int result = 0;
		
		while (n!=0) {
			result = result *10 + n%10;
			n /=10;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		//������ ���� ��� Ǯ���
		//1. 1~n���� �Ϸķ� ����ϴ� �޼���
		printNumber(5);
		printNumber(3);
		
		//2. 1~n������ �հ踦 ��ȯ�ϴ� �޼���
		int sum = total(5);
		
		System.out.println("\nsum = " + sum);
		System.out.println("total(3) = "+ total(3));
		
		
		
		//3.���޵� �迭���� �޼����� �ִ밪�� ��ȯ
		int[] arr= new int[] {10,20,50,40,30};
		int max = maxArr(arr); //����max�� main���� ���θ��� ������.�򰥸�������
		
		System.out.println("\nmax = " + max);
		
		
		
		//4.���޵� ���� �Ųٷ� ��ȯ
		int rev = reverse(123);
		
		System.out.println("\nrev = "+ rev);
		System.out.println("reverse(5631) = "+ reverse(5631));
		
		
		
	}

}
