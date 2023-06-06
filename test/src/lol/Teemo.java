package lol;

import java.util.Timer;
import java.util.TimerTask;

public class Teemo extends Unit{
	private Timer timer;
	
    public String getName() {
        return "티모";
    }
	public Teemo() {
		super(600, 260, 54, 1);
		this.timer = new Timer();
	}
	
	//티모  실명
	public void poison(Unit tar, int duration) {
		if(tar != null) {
			tar.setAp(0);
			System.out.println(this.getName() +"이(가)" + 
						tar.getName()+"에게 독침을 쏘아 실명");
			
			// duration의 시간 만큼의 평타 무력화
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					tar.setAp(tar.getAp());
					System.out.println(tar.getName()+"의 평타공격력 복구");
				}
			},duration*1000);
		} else {
			System.out.println("유효한 대상이 아닙니다.");
		}
		
	}

}
