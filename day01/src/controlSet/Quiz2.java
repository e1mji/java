package controlSet;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		//PDF 10p 2��)
		Scanner sc = new Scanner(System.in);
		int usb = 5000,n;
		int total;
		
		System.out.print("USB ���� ���� ? ");
		n = sc.nextInt();
		
		total = usb *n;
		if (n >=100) {
			total *=0.88;
		}
		else if (n>=10) {
			total *=0.9;
		}
		System.out.println("�ѱݾ� : " + total + "��");
		
		sc.close();
	}

}
