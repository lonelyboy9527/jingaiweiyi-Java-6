package cc.openhome.class2;

public abstract class GuessGame {
	public void go() {
		int number = (int) (Math.random() * 10);
		System.out.println("要猜的数字:" + number);
		int guess;
		do {
			print("输入数字:");
			guess = nextInt();
		} while (guess != number);
		println("猜中了");
	}
	/* 虽然是抽象方法，但是在类中还是可以调用。*/
	public abstract void print(String text);
	public abstract void println(String text);
	public abstract int nextInt();
}
