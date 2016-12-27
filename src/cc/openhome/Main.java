package cc.openhome;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		exp1();
		exp2();
	}
	/* ********************6.2 继承语法细节******************** */
	public static void exp2() {
//		MyClass2.exp1(); // 6.2.1 protected成员
//		MyClass2.exp2(); // 6.2.2 重新定义的细节
//		MyClass2.exp3(); // 6.2.3 再看构造函数
//		MyClass2.exp4(); // 6.2.4 再看final关键字
//		MyClass2.exp5(); // 6.2.5 java.lang.Object
//		MyClass2.exp6(); // 6.2.6 关于垃圾收集
		MyClass2.exp7(); // 6.2.7 再看抽象类
	}
	/* ********************6.1 何谓继承******************** */
	public static void exp1() {
		/* 面向对象中，子类继承父类，避免重复的行为定义，
		 * 不过并非为了避免重复定义行为就使用继承，滥用继承而导致程序维护上的问题很多
		 * 如何正确判断使用继承的时机，以及继承之后如何活用多态，才是学习继承时的重点。
		 * 
		 * */
//		MyClass.exp1(); // 6.1.1 继承共同行为
//		MyClass.exp2(); // 6.1.2 多态与is-a
//		MyClass.exp3(); // 6.1.3 重新定义行为
		MyClass.exp4(); // 6.1.4 抽象方法，抽象类
	}

}
