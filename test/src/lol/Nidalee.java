package lol;

public class Nidalee extends Unit{
    public String getName() {
        return "니달리";
    }
    
	int distance = 100;
	public Nidalee() {
		super(540, 260, 53, 1);
	}
	
	//니달리 핵창
	public void spearThrow(Unit tar ,int distance) {
		if(this.getMp() == 0) {
			System.out.println("마나 부족 ");
		}
		else if(distance<=this.distance) {
			int damage = getAttackDamage()+500 ;
			tar.setHp(tar.getHp()-damage);
			System.out.println(this.getName()+"이(가)"+ tar.getName()+
						"에게  스킬사용"+ damage +"만큼 체력감소");
		}
		else {
			System.out.println("스킬 사정거리를 벗어났습니다.");
		}
	}
}
