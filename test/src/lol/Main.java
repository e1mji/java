package lol;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//넥서스준비
		 Nexus nexus = null;
		 Minion minion  = null;

		
		//챔피언준비 (니달리, 소나, 티모)
		Nidalee n1 = null;
		Sona s1 = null;
		Teemo t1 = null;
		
		//확인용변수
		int row;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("0.소환사의 협곡에 오신 것을 환영합니다");
			System.out.println("1.챔피언생성");
			System.out.println("2.레벨업");
			System.out.println("3.상태확인");
			System.out.println("4.공격");
			System.out.println("5.게임종료");
			System.out.println("메뉴에따라 챔피언을 조종하세요");
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 0:
				if(nexus == null) {
					nexus  = new Nexus();
					 minion = new Minion(8);
					System.out.println("넥서스가 생성되었습니다.");
					System.out.println("미니언" +minion.getNum()+"마리생성");
				} else {
					System.out.println("이미 넥서스가 생성됐습니다.");
				}
				System.out.println();
				System.out.println();
				
				break;
				
			// 챔피언생성
			case 1:
				   if (nexus != null) {
				      if (n1 == null && s1 == null && t1 == null) {
				          n1 = new Nidalee();
				          s1 = new Sona();
				          t1 = new Teemo();
				          System.out.println("니달리, 소나, 티모가 생성되었습니다.");
				        } else {
				            System.out.println("이미 챔피언이 생성되었습니다.");
				        }
				    } else {
				        System.out.println("넥서스를 먼저 생성해야 합니다.");
				    }
				    break;
				    
				    
				    
			// 레벨업
			case 2:
			    if (nexus != null && minion != null) {
			        System.out.println("레벨업할 챔피언을 선택하세요 (1. 니달리, 2. 티모, 3. 소나):");
			        int championChoice = Integer.parseInt(sc.nextLine());

			        switch (championChoice) {
			            case 1:
			                if (n1 != null) {
			                    n1.levelUp();
			                    System.out.println("니달리가 미니언을 먹고 레벨업하였습니다.");
			                } else {
			                    System.out.println("니달리가 생성되지 않았습니다.");
			                }
			                System.out.println();
			                System.out.println();
			                
			                break;
			            case 2:
			                if (t1 != null) {
			                    t1.levelUp();
			                    System.out.println("티모가 미니언을 먹고 레벨업하였습니다.");
			                } else {
			                    System.out.println("티모가 생성되지 않았습니다.");
			                }
			                break;
			            case 3:
			                if (s1 != null) {
			                    s1.levelUp();
			                    System.out.println("소나가 미니언을 먹고 레벨업하였습니다.");
			                } else {
			                    System.out.println("소나가 생성되지 않았습니다.");
			                }
			                break;
			            default:
			                System.out.println("유효한 선택이 아닙니다.");
			                break;
			        }
			        
			    } else {
			        System.out.println("넥서스와 미니언을 먼저 생성해야 합니다.");
			    }
			    break;
			    
			//상태확인
			case 3:
			    if (n1 != null) {
			        n1.statCheck(n1);
			    } else {
			        System.out.println("니달리가 생성되지 않았습니다.");
			    }

			    if (t1 != null) {
			        t1.statCheck(t1);
			    } else {
			        System.out.println("티모가 생성되지 않았습니다.");
			    }

			    if (s1 != null) {
			        s1.statCheck(s1);
			    } else {
			        System.out.println("소나가 생성되지 않았습니다.");
			    }
			    break;
			//스킬 	
			case 4:
				if(n1 != null &&  t1!=null && s1 !=null) {
					t1.poison(s1, 3);
					n1.spearThrow(t1, 50);
					s1.healing(t1, 30);
					break;
				}
			case 5:
				nexus = new Nexus();
				nexus.endGame();
				sc.close();
				break;
			default:
				System.out.println("잘못누르셨습니다 다시시도하세요");
				break;
				
			}
		}
		
	}

}
