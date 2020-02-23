package com.me.learn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayGame ipg = new IPlayGame(){
			public void playGame()
			{
				System.out.println("使用匿名内部类方式实现接口1");
			}
		};
		ipg.playGame();
		
		
		new IPlayGame(){
			public void playGame()
			{
				System.out.println("使用匿名内部类方式实现接口2");
			}
		}.playGame();
	}

}
