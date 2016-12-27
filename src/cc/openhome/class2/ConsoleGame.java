package cc.openhome.class2;

import java.util.Scanner;

public class ConsoleGame extends GuessGame {

	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public void print(String text) {
		// TODO Auto-generated method stub
		System.out.println("Java平台"+ text);
	}

	@Override
	public void println(String text) {
		// TODO Auto-generated method stub
		System.out.println("Java平台"+ text);
	}

	@Override
	public int nextInt() {
		// TODO Auto-generated method stub
		return scanner.nextInt();
	}

}
