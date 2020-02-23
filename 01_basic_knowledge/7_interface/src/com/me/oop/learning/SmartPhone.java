package com.me.oop.learning;

public class SmartPhone extends TelPhone implements IPlayGame {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("SmartPhone call");
	}
	
	public void playGame()
	{
		System.out.println("SmartPhone playGame");
	}

}
