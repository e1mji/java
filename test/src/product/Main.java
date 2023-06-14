package product;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//핸들러 객체 (의존성주입)
		Handler handler = new Handler();
		
		Product tmp = null;
		Product[] arr = null;
		
		int menu; 
		
		String name;
		int price = 0;
		int row = 0;
		
		Scanner sc = new Scanner(System.in);
		
		handler.add(new Food("양상추", 3000, "2023-06-12"));
		handler.add(new Food("양배추", 2500, "2023-06-12"));
		handler.add(new IndusProduct("목장갑", 1500, "독일"));
		handler.add(new IndusProduct("전구", 3000, "프랑스"));
		handler.add(new IndusProduct("드라이버", 1500, "홍콩"));
		
		
		while(true) {
			System.out.println("1.전체상품");
			System.out.println("2.상품추가");
			System.out.println("3.상품검색");
			System.out.println("4.상품삭제");
			System.out.println("5.정렬");
			System.out.println("0.프로그램종료");
			System.out.println("메뉴를 선택하세요>>>");
			
			menu = Integer.parseInt(sc.nextLine());
			
			
			switch(menu) {
				case 1:
					arr= handler.selectAll();
					for(Product p : arr) {
						if(p != null) {
							System.out.println(p);
						}
					}
					break;
					
				case 2:
					System.out.println("상품 유형을 선택하세요");
					System.out.print("1. 식품  | 2.공산품 :");
					menu = Integer.parseInt(sc.nextLine());
					
					if	 	(menu ==1) tmp = makeFood(sc);
					else if	(menu ==2) tmp = makeIndusProduct(sc);
					else 				tmp = null;
						row = handler.add(tmp);
						System.out.println(row !=0 ? "추가성공" : "추가실패");
						break;
						
				case 3:
					System.out.println("이름으로 검색 :");
					name = sc.nextLine();
					arr  = handler.search(name);
					for(Product p : arr) {
						if(p != null) {
							System.out.println(p);
						}
					}
					break;
				case 4:
					System.out.print("이름으로 삭제 ");
					name = sc.nextLine();
					
					row = handler.delete(name);
					System.out.println("삭제된 개수 : " + row);
					System.out.println(row !=0 ? "삭제성공" : "삭제실패");
					break;
					
				case 5:
					System.out.println("가격으로 정렬");
					arr= handler.sort(price);
					for(int i=0; i<arr.length; i++) {
						Product p = arr[i];
						if(p != null) {
							System.out.println(p);
						}
					}
					break;
				case 0:
					sc.close();
					System.out.println("프로그램종료");
					return;
				default:
					System.err.println("메뉴를 다시선택해주세요");
					}// end of switch 
			System.out.println();
			}//end of while
			
		}// end of main

	private static Product makeIndusProduct(Scanner sc) {
		String name;
		int price;
		String madeIn;
		
		System.out.print("상품 이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("상품 가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("제조 국가 입력 :");
		madeIn = sc.nextLine();
		
		IndusProduct indus = new IndusProduct(name, price, madeIn);
		
		
		
		return indus;
	}

	private static Product makeFood(Scanner sc) {
		String name;
		int price;
		String expireDate;
		
		System.out.print("상품이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("상품가격입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		System.out.print("상품 유통기한 입력 : ");
		expireDate = sc.nextLine();
		
		Food food = new Food(name, price, expireDate);
		return food;
	}
		
		
		
	}


