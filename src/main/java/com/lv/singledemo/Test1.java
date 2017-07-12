package com.lv.singledemo;

import org.junit.Test;

/**
 * Hello world!
 *
 */
class App{
	
	private static volatile App app = null;
	
	private App(){
		
	}
	
	public static App getinstance(){
		synchronized (App.class) {
			if(app == null){
				app = new App();
			}
		}
		return app;
	}
	
	public void print1(){
		System.out.println("这是一个单利对象");
	}
	
}

public class Test1{
	@Test
	public void main1() {
		App getinstance = App.getinstance();
		getinstance.print1();
	}
}