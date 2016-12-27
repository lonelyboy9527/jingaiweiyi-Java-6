package cc.openhome;


import java.util.Scanner;


import cc.openhome.class2.ArrayList;
import cc.openhome.class2.Cat;
import cc.openhome.class2.ConsoleGame;
import cc.openhome.class2.GuessGame;
import cc.openhome.class2.Magician;
import cc.openhome.class2.SwordsMan;
import cc.openhome.class2.GuessGame;

public class MyClass2 {
	//protected成员
	public static void exp1() {
		/* 上一节， 如果建立了一个角色，想要显示角色的细节，则必须挨个打印
		 * 
		 * 我们可以为每个角色类写一个 toString()方法， 返回其细节信息
		 * 但是，细节信息name，level，blood信息都是private，无法在子类中存取，需要通过getName()，getLevel()等方法来取得
		 * 如果定义为 public，则又完全开放
		 * 
		 * 因此我们可以将其定义为 protected
		 * */
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.println(swordsMan.toString());
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.println(magician.toString());
		
		/* Java中的三个关键字 public、protected、（default）、private
		 * 
		 * 四个权限范围都要非常清楚，如果不知道一开始用什么权限范围，可以先设定为private，之后用到时，再逐步开放。
		 * */
	}
	// 重新定义的细节
	public static void exp2() {
		/* 有时候，重写父类的方法，并不是不满意父类的方法，
		 * 
		 * 只是希望执行父类的前、后做点加工。可以先调用父类方法
		 * 
		 * 1.可以使用 super. 调用父类方法（注意此方法不能private）
		 * 2.子类重写父类方法时，权限可以扩大，但是不能缩小。
		 * 3.在JDk5之前，重写方法时，除了可以扩大权限关键字外，其他部分必须相同。
		 * 	 在JDK5之后，重新定义方法时，如果返回类型是父类中方法返回类型的子类，也是可以的
		 * 
		 * 例子：
		 * */
		
		/* 1.可以使用 super. 
		 * 2. 调用父类方法.子类重写父类方法时，权限可以扩大，但是不能缩小。
		 **/
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		
		System.out.println(swordsMan.eat());
		System.out.println(magician.eat());
		
		//2.在JDK5之后，重新定义方法时，如果返回类型是父类中方法返回类型的子类，也是可以的
		SwordsMan swordsMan2 = new SwordsMan();
		swordsMan2.setName("Justin");
		swordsMan2.setLevel(1);
		swordsMan2.setBlood(200);
		
		SwordsMan swordsMan3 = swordsMan2.copy();
		System.out.println(swordsMan3.toString());
	}
	
	// 再看构造函数
	public static void exp3() {
		/* 如果类有继承关系，在创建子类实例后，
		 * 
		 * 会先进行父类定义的初始化流程，再进行子类中定义的初始流程。
		 * 
		 * 构造函数可以重载，如果子类构造函数没有指定执行父类中哪个构造函数，默认会调用父类中无参构造函数。
		 * 
		 * 注意：如果父类存在有参数构造函数，并且没有提供无参构造函数，子类需要手动调用有参构造函数，以让父类先初始化
		 * 因为父类存在有参构造函数，默认构造函数JVM就不会自动创建了（除非手动创建），需要手动先调用父类的构造函数
		 * 无论如何，子类一定要调用父类的构造函数
		 * */
		
		/* 默认会调用父类中的 构造函数
		 * 
		 * 可以在构造函数中，手动更改调用哪一个父类的构造函数
		 * 
		 * 注意：构造函数中 this() 和 super()只能选择一个调用，而且一定要写在构造函数第一行
		 * */
		Other other = new Other();
		
	}
	
	// 再看final关键字
	public static void exp4() {
		/* 在3.1.2中谈过，如果在指定变量值后，就不想再改变变量值，可以在声明变量时加上final限定，如果后续撰写程序时，想要修改，就会发生错误。
		 * 
		 * 1.class 前也可以加上final关键字，
		 * 如果 class前使用了fianl，表示这个类是最后一个了，不会再有子类（就是不能够继承了）
		 * 
		 * 例如：String类在定义时候就限定为final了，查阅API文档
		 * 
		 * 2.定义方法时，也可以限定方法为final
		 * 这表示这是最后一次定义方法了，子类不可以重写final方法
		 * */
	}
	
	// java.lang.Object
	public static void exp5() {
		/* 在Java中，子类只能继承一个父类，
		 * 
		 * 如果定义时没有使用 extends关键字指定继承任何类，那一定是继承 java.lang.Object
		 * 
		 * 因此在Java中，任何类追溯至上层父类，一定就是 java.lang.Object，也就是Java中所有对象，一定是一种 "Object"
		 * 
		 * */
		Object o1 = "Justin";
		/* 1.如果需要数组收集各种对象，那么应该声明为什么？ 
		 * 
		 * Object[]
		 * */
		Object[] objects = {"Monica", new SwordsMan(), new Magician()};
		String namem = (String) objects[0];
		SwordsMan swordsMan = (SwordsMan) objects[1];
		Magician magician = (Magician) objects[2];
		
		/* 2.数组长度有限，以下定义ArrayList类，可以不限长度的收集对象
		 * 
		 * 自定义ArrayList类，内部使用Object数组来收集对象，每一次收集的对象会放在next指定的索引处，详情请看 ArrayList类内部实现
		 * 
		 * 以下使用ArrayList，收集访客名称，并将名单转为大写后显示：
		 * */
		ArrayList list = new ArrayList();
		Scanner scanner = new Scanner(System.in);
		String name;
		while(true) {
			System.out.print("访客名称:");
			
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}
			list.add(name);
		}
		System.out.println("访客名单:");
		for (int i = 0; i < list.size(); i++) {
			String quest = (String)list.get(i);
			System.out.println(quest.toUpperCase());
		}	
		
		/* 3.java.lang.Object 是所有类的顶层父类，这代表了Object上定义的方法，所有对象都继承下来了。
		 * 
		 * 只要不是被定义为final的方法，都可以重新定义：
		 * */
		/* （1）重新定义 toString() 
		 * toString() 是Object 上的方法，我们可以重新定义toString 以取得自定义类的相关描述。
		 * */
		SwordsMan swordsMan2 = new SwordsMan();
		swordsMan2.setName("Justin");
		swordsMan2.setLevel(1);
		swordsMan2.setBlood(200);
		System.out.println(swordsMan2.toString());
		// 许多方法若传入对象，默认都会调用 toString()
		System.out.println("println传入对象默认调用: " + swordsMan2);
		
		/* （2）重新定义 equals() 
		 * 在4.1.3中谈过，在Java中要比较两个对象的实质相等性，并不是使用 == ，而是通过equals()
		 * equals() 是Object 上的方法，其内部是：
		 * public boolean equals(Object obj) {
		 * 		return (this == obj);
		 * }
		 * 如果没有重新定义equals ，使用equals和 == 没有区别（String中重写了Object的 equals()方法）
		 * 
		 * 例子：比较两个Cat对象是否实际上代表同一只 Cat的数据:
		 * */
		Cat cat = new Cat("Kitty", 10);
		Cat cat2 = cat;
		SwordsMan cat3 = new SwordsMan();
		Cat cat4 = new Cat("Kitty", 10);
		System.out.printf("cat.equals(cat2):%b\n", cat.equals(cat2));
		System.out.printf("cat.equals(cat3):%b\n", cat.equals(cat3));
		System.out.printf("cat.equals(cat4):%b\n", cat.equals(cat4));
		/* 这里仅仅只是示范了 equals的基本概念，实际上操作equals() 通常也会操作 hashCode()
		 * 
		 * hashCode() 后面介绍
		 * */	
	}
	// 关于垃圾收集
	public static void exp6() {
		/* 创建对象会占用内存，如果程序执行流程中已无法再使用某个对象，该对象就只是徒耗内存中的垃圾
		 * 
		 * 对不再有用的对象，JVM有垃圾收集机制，收集到的垃圾对象所占据的内存空间，会被垃圾收集器释放。
		 * 
		 * 那么，哪些会被JVM认定为垃圾对象？？？
		 * 	简单来说，执行流程中，无法通过变量参考的对象，就是GC认定的垃圾对象。
		 * 
		 * 什么是执行流程？
		 * 	具体来说，就是线程（Thread），目前我们接触到的就是 从main() 程序进入开始之后的主线程。
		 * 
		 * 例子：
		 * */
		Some some1 = new Some();
		Some some2 = new Some();
		/* 将some2参考的对象也给some1参考，
		 * 原先的some1所参考的对象不被任何名称参考，通过主线程也不能再参考到该对象，这个对象就是内存中的垃圾了，
		 * GC会自动找出这些垃圾并予以回收。
		 * */ 
		some1 = some2;
		
		/* 例子：
		 * 数组参考的对象全部都会被回收:
		 * 注意被回收的对象 包括了数组本身，以及3个被参考的对象
		 * */
		Some[] somes = {new Some(), new Some(), new Some()};
		somes = null;
		
		/* 例子：
		 * 孤岛的参考环，环中对象会被全部回收
		 * */
		
		/* 注意：
		 * 
		 * GC在进行回收对象前，会调用对象的 finalize()方法，这是Object上定义的方法。
		 * 
		 * 如果在对象被回收前，有些事情想做，可以重写这个方法，不过要注意的是：
		 * 
		 * 何时启动GC，要视所采用的GC算法而定，也就是finalize() 方法被调用的时机是无法确定的。
		 * finalize()方法类似与OC中的dealloc()方法
		 * */
	}
	// 再看抽象类
	public static void exp7() {
		/* 撰写程序有些看是似不合理但又非得完成的需求
		 * 
		 * 例子:例如老板需要一个猜数字的游戏，但是还没有想好在哪个平台运行游戏。
		 * 此时取得用户的输入、显示结果的环境未定，但是，我们负责的程序流程可以确定：
		 * 
		 * */
		/* GuessGame这个类定义不完整，含有抽象方法，但能在里面操作玩游戏的流程。*/
//		GuessGame guessGame = new GuessGame();
		/* 等老板决定了游戏运行平台，例如还是在Java平台，那么我们写一个ConsoleGame类，继承GuessGame类
		 * 在ConsoleGame中操作当中的抽象方法即可：
		 * 
		 * */
		GuessGame game = new ConsoleGame();
		game.go();
		/* 设计上的经验，称为设计模式，上面的例子是 Template method 模式的实例子*/
	}
}
//+++++++++++++再看构造函数+++++++++++++
class Some {
	Some() {
		System.out.println("调用Some()");
	}
	Some(int i) {
		System.out.println("调用Some(int i)");
	}
}
class Other extends Some {
	Other() {
		// 手动调用分类指定的构造函数
		// 构造函数中 this() 和 super()只能选择一个调用，而且一定要写在构造函数第一行
		// 无论如何，子类一定要调用父类的构造函数
		super(10);
		System.out.println("调用Other()");
	}
}