package _switch;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// JavaÀÇ switch¹®Àº ¹«ÀÚ¿­µµ Ã³¸®ÇÒ ¼ö ÀÖ´Ù. 
		Scanner sc= new Scanner(System.in);
		String menu;
			
		System.out.println("--------- menu ---------");
		System.out.println("\t1. Â¥Àå¸é");
		System.out.println("\t2. Â«»Í");
		System.out.println("\t3. ººÀ½¹ä");
		System.out.println("\t4. ÅÁ¼öÀ°");
		
		System.out.print("\n>>> ");
		menu = sc.next();
		
		switch (menu) {
		case "Â¥Àå¸é": case "1":
			System.out.println("Â¥Àå¸é ÁÖ¹®~");
			break;
		case "Â«»Í": case "2":
			System.out.println("Â«»Í ÁÖ¹®~");
			break;
		case "ººÀ½¹ä": case "3":
			System.out.println("ººÀ½¹ä ÁÖ¹®~");
			break;
		case "ÅÁ¼öÀ°": case "4":
			System.out.println("ÅÁ¼öÀ° ÁÖ¹®~");
			break;
		default:
			System.out.println("¾ø´Â ¸Ş´º ÀÔ´Ï´Ù");
		}
		
		sc.close();
		
	
	}

}
