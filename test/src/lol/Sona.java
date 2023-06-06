package lol;

public class Sona extends Unit{
    public String getName() {
        return "소나";
    }
	
	
	
	public Sona() {
		super(550,340, 49, 1);

	}
	
	//소나 힐
	public void healing(Unit tar, int hp) {
		if(this.getMp() == 0) {
			System.out.println("마나가 없습니다.");
		}
		else if(tar !=null) {
			if(tar instanceof Sona) {
				tar.setHp(tar.getHp()+hp );
				System.out.println(this.getName() + "(이)가"+tar.getName()
							+"을 "+hp+"만큼 힐");
			}
			else {
				System.out.println("해당챔피언이 해당스킬을 가지고 있지않습니다.");
			}
			
		}else {
			System.out.println("유효한 대상이 아닙니다.");
			
		}
	}

}
