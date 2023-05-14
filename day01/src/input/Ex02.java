package input;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// 다른 타입도 입력을 받아 보자~
		
		boolean bo;
		byte by;
		short sh;
		int it;
		long lo;
		float fl;
		double db;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("참/거짓?  ");
		bo = scan.nextBoolean();		// next자료형()
		
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
