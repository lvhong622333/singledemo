package com.lv.singledemo;

import org.junit.Test;

public class TestDemo1 {
	@Test
	public void test1(){
		FactoryDemo.getinstance("man").behavior();
		FactoryDemo.getinstance("women").behavior();
	}
}
