package lv00_foundation;

public class Ex02 {
	/*
	 * 차 / 뜨 상관없이 
		아메리카노 4500
		카페라떼 5000
		
		팀원 마실 메뉴 : 
		if "카페라테"  = 차가운 카페라떼
		if "아무거나"  = 차가운 아메리카노
		
		결제하게 될 금액 return  int total = 
	 */
	
	//코딩 기초트레이닝(커피심부름)
	public int solution(String[] order) {
		int americanoPrice = 4500;
		int cafelattePrice = 5000; 
        int total = 0;

        for(int i =0; i < order.length; i++) {
            String menu = order[i];
        	if (menu != null && menu.equals("anything")) {
        		total += americanoPrice;
        	}
        	else if (menu!= null && menu.contains("americano")) {
        		total +=americanoPrice;
        	}
        	else if (menu != null && menu.contains("cafelatte")) {
        		total += cafelattePrice;
        	}
        }	
        
        return total;
    }
	
	public static void main(String[] args) {
		
	}

}
