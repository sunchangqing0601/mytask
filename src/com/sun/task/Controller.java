package com.sun.task;

import java.util.Calendar;
import java.util.Timer;

public class Controller {
	
	public void runTask() {
		Timer t = new Timer(); // 建立Timer对象
		ControllerMytask task = new ControllerMytask(t); // 定义任务
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 42);

//		t.schedule(task, cal.getTime(),30*1000);
		t.scheduleAtFixedRate(task, cal.getTime(),120*1000);
	}

}
