package array;

public class Quiz2 {
	public static void main(String[] args) {
		int[][] arr = new int[8][8];
		int count =1;
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = count;
				count++;
				
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[j][i]);
			}
			System.out.println();
		}
					
	}

}
