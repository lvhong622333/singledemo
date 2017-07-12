package com.lv.singledemo;

public class FactoryDemo {

	public static People getinstance(String flag) {
		People people = null;
		switch (flag) {
		case "man":
			people = new Man();
			break;
		case "women":
			people = new Women();
			break;
		}
		return people;
	}
}
