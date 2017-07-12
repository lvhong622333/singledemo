package com.lv.singledemo;

import org.junit.Test;

/**
 * Hello world!
 *
 */
class App{
	
	private static App app = new App();
	
	private App(){
		
	}
	public static App getinstance(){
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