package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// �ٸ� Ÿ�Ե� �Է��� �޾� ����~
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("��/����?  ");
		bo = scan.nextBoolean();		// next�ڷ���()
		
		System.out.println("bo = " + bo + "\n");
		
		
		System.out.print("byte : ");
		by = scan.nextByte();
		
		System.out.println("by = " + by + "\n");
		
		
		System.out.print("short : ");
		sh = scan.nextShort();
		
		System.out.println("sh = " + sh + "\n");
		
		
		System.out.print("int : ");
		it = scan.nextInt();
		
		System.out.println("it = " + it + "\n");
		
		
		System.out.print("long : ");
		lo = scan.nextLong();
		
		System.out.println("lo = " + lo + "\n");
		
		
		System.out.print("float : ");
		fl = scan.nextFloat();
		
		System.out.println("fl = " + fl + "\n");
		
		
		System.out.print("double : ");
		db = scan.nextDouble();
		
		System.out.println("db = " + db);
		
		scan.close();
	}

}
