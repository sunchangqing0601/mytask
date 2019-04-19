package com.sun.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Mytask extends TimerTask{
	private Timer timer;
	private int count = 0;

    public Mytask(Timer timer) {
        this.timer = timer;
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 SimpleDateFormat sdf = null;
	     sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	     System.out.println(this.timer+"------当日时间：" + sdf.format(new Date()));
	     if(count++ >= 6) {
	    	 this.timer.cancel();
	    	 System.out.println(this.timer+"----》结束当日线程！");
	     }
	}

}
