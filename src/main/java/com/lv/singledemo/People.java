package com.lv.singledemo;

public interface People {
	public abstract void behavior();
}

class Man implements People{

	@Override
	public void behavior() {
		System.out.println("坚强的扛起一片天");
	}
	
}

class Women implements People{

	@Override
	public void behavior() {
		System.out.println("柔弱似水");
	}
	
}