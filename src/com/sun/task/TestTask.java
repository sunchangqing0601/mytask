package com.sun.task;

import java.util.Calendar;
import java.util.Timer;

public class TestTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer t = new Timer(); // 建立Timer对象
		ControllerMytask task = new ControllerMytask(t); // 定义任务
//		SimpleDateFormat sdf = null;
//	    sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//	    Date date = new Date(2019,4,19,9,58,0);
//		t.schedule(task, 1000);// 设置任务的执行，1秒后开始，每2秒执行一次

		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MINUTE, 32);
//		System.out.println("年:" + cal.get(Calendar.YEAR));
//	    System.out.println("月:" + (cal.get(Calendar.MONTH) + 1));       
//	    System.out.println("日:" + cal.get(Calendar.DAY_OF_MONTH));
//	    System.out.println("时:" + cal.get(Calendar.HOUR_OF_DAY));
//	    System.out.println("分:" + cal.get(Calendar.MINUTE));
//	    System.out.println("秒:" + cal.get(Calendar.SECOND));
//		t.schedule(task, cal.getTime(),30*1000);
		t.scheduleAtFixedRate(task, cal.getTime(),120*1000);
//		while(true) {
//			
//		}
		
	}

}
