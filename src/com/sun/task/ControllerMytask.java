package com.sun.task;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ControllerMytask  extends TimerTask{
	private Timer timer;

    public ControllerMytask(Timer timer) {
        this.timer = timer;
    }

	@Override
	public void run() {
		System.out.println("月份控制线程开始---》"+this.timer);
		// TODO Auto-generated method stub
		Timer t = new Timer();
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 30);
//		cal.set(Calendar.MINUTE, 12);
		t.scheduleAtFixedRate(new Mytask(t), cal.getTime(),10*1000);
	}

}
