package com.me.learn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayGame ipg = new IPlayGame(){
			public void playGame()
			{
				System.out.println("ʹ�������ڲ��෽ʽʵ�ֽӿ�1");
			}
		};
		ipg.playGame();
		
		
		new IPlayGame(){
			public void playGame()
			{
				System.out.println("ʹ�������ڲ��෽ʽʵ�ֽӿ�2");
			}
		}.playGame();
	}

}
