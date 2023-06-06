package lol;

import java.util.Scanner;

public class Unit {
	// 체력,마나
	private int Hp;
	private int Mp;
	private int level=1;
	private String name;
	
	private int attackDamage;
	private String skill="";
	//평타
	private int Ap;
	private boolean life = true;
	
	String[] skillList = new String[]{"q","w","e","R"};
	
	//getter, setter 
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getMp() {
		return Mp;
	}
	public void setMp(int mp) {
		Mp = mp;
	}
	public boolean isLife() {
		return life;
	}
	public void setLife(boolean life) {
		this.life = life;
	}
	public int getAp() {
		return Ap;
	}
	public void setAp(int ap) {
		Ap = ap;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public int getAttackDamage() {
		return attackDamage;
	}
	
	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}
	public String getName() {
		return name;
	}
	public Unit(int hp, int mp,int ap,int level) {
		this.Hp = hp;
		this.Mp = mp;
		this.Ap = ap;
		this.level = level;
	}
	
	//리스폰
	public void respawn(Unit tar) {
		System.out.println(tar.getName()+"이(가)"+"부활");
	}
	
	
	//상태 확인
	public void statCheck(Unit tar) {
		if(this.Hp == 0) {
			System.out.println("아직리스폰 되지않았습니다.");
			life  = !life;
		}
		else
		{
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.printf("        %s의 현재 상태\t        %n"
					+ " ―――――――――――――――――― %n"
					+ "        체력: %d\t        %n"
					+ "        마나: %d\t        %n"
					+ "        평타:%d\t        %n"
					+ "        레벨:%d\t        %n"
					+ "┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛"
					+ "%n",tar.getName(),tar.getHp(),tar.getMp(),tar.getAp(),tar.getLevel());
			}
	}
	
	public void Attack(Unit unit) {
		if(life && unit.Hp > this.Ap) {
			unit.Hp -= this.Ap;
			unit.statCheck(unit);
		}
		else {
			life = !life;
			System.out.println("챔피언 사망.");
		}
		}
	
	public void eatMinion(Unit unit) {
		System.out.println("챔피언이 미니언을 먹습니다");
		levelUp();
	}
		
	
	public void levelUp() {
		level++;
		Hp+=50;
		Mp+=20;
		Ap+=5;
		Scanner sc = new Scanner(System.in);
		System.out.print("스킬을 선택하세요 (q,w,e,r) : ");
		String seletedSkill = sc.nextLine();
		
		for(String s : skillList) {
			if(s.equalsIgnoreCase(seletedSkill)) {
				skill = s;
				break;
			}
		}
		
		System.out.println("챔피언  "+level+"로 레벨업!");
		System.out.println("스킬이 추가됐습니다 : "+ skill);
	}
	}
	

