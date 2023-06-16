package array;

public class Ex07 {
	public static void main(String[] args) {
		//배열은 Reference Type이고, 그냥 출력하면 내부 데이터가 출력되지 않는다 
		int[] t1 = {};
		System.out.println("t1 : "+ t1);
		
		//배열은 값을 지정하여 생성하거나, 길이를 지정하여 생성할 수 있다.
		int[] t2 = {10,30,20,40,50};
		int[] t3 = new int[5];
		int[] t4  = new int[] {1,5,4,2,3};
		
		String s1 = "Hello";
		String s2 = new String("Hello");
		
		//길이를 지정하여 생성하면 , 값은 자료형에 따라 0에 맞는 값으로 초기화 된다.
		for ( int i = 0; i< t2.length; i++) {
			System.out.print(t2[i] + " ");
		}
		System.out.println();
		
		for(int num : t3) {
			System.out.print(num + " ");
		}
		System.out.println();
		 
		// 자바의 참조변수 특성때문에 다른 배열을 가리킬 수 있다. 
		// 배열의 길이는 변할 수 없으나, 변수가 다른 배열을 가리키면서 
		// 길이가 바뀐 것 처럼 보인다. 
		int[] t6 = {1,2,3};
		System.out.print(t6 + ":");
		for(int num : t6) System.out.print(num + " ");
		System.out.println();
		
		
	}

}
