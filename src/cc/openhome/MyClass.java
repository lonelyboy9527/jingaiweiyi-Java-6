package cc.openhome;
import cc.openhome.class1.*;
public class MyClass {
	// 继承共同行为
	public static void exp1() {
		/* 继承基本上就是避免多个类间重复定义共同行为。
		 * 下面以实际例子来说明比较清楚，假设正在开发一款RPG游戏，一开始设定的角色有剑士和魔法师。
		 * 
		 * 定义了剑士类, 魔法师类，将它们共同的行为放在一个类中，人后再继承这个父类，扩充自己的行为
		 * 
		 * */
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		System.out.printf("剑士: (%s, %d, %d)\n", swordsMan.getName(), swordsMan.getLevel(), swordsMan.getBlood());
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		System.out.printf("魔法师: (%s, %d, %d)\n", magician.getName(), magician.getLevel(), magician.getBlood());
		/* 虽然SwordsMan和Magician并没有定义 这些方法，但是从Role继承了这些方法，所以就如范例中可以直接使用。
		 * 
		 * 继承的好处之一：
		 * 就是你要将name, level,blood 改为其他名称，只要在 Role中改就好了
		 * */
	}
	// 多态与is-a
	public static void exp2() {
		/* 在Java中，子类只能继承一个父类，继承除了可避免类间重复行为定义之外，还有个重要的关系，
		 * 
		 * 就是子类与父类之间会有 is-a的关系。(中文称为 "是一种" 的关系)
		 * 
		 * 什么意思？
		 * SwordsMan继承了Role，所以SwordsMan是一种 Role
		 * Magician继承了Role，所以Magician是一种 Role
		 * 
		 * 为何要知道继承时，父类和子类间有“是一种”的关系？
		 * 例子
		 * */
		SwordsMan swordsMan = new SwordsMan();
		Magician magician = new Magician();
		// 以下能通过编译
		Role role1 = new SwordsMan(); // 因为 SwordsMan 是一种 Role
		Role role2 = new Magician();
		// 以下编译失败
		Role role3 = new SwordsMan(); // 可以
//		SwordsMan swordsMan2 = role1; // 失败,检查role1不一定是 SwordsMan
		// 强制说明，能够成功
		SwordsMan swordsMan3 = (SwordsMan) role3; // 强制让编译器住嘴，通过编译，后果自负
		
		//以下编译成功，执行出错
		Role role = new Magician();
//		SwordsMan swordsMan2 = (SwordsMan) role; // 会抛出异常，不像OC在运行时才抛异常。
		
		/* 例如：
		 * 下面通过多态性，显示角色血量。
		 * 
		 * */
		SwordsMan swordsMan5 = new SwordsMan();
		swordsMan5.setName("Justin");
		swordsMan5.setLevel(1);
		swordsMan5.setBlood(200);
		showBlood(swordsMan5);
		
		Magician magician5 = new Magician();
		magician5.setName("Monica");
		magician5.setLevel(1);
		magician5.setBlood(100);
		showBlood(magician5);
		/* 总结：
		 * 
		 * 父类可以指向子类，
		 * 子类指向父类对象，则需要强制说明
		 * 
		 * 什么是多态？
		 * 以抽象讲法解释，就是使用单一接口操作多种类型的对象。
		 * */
		
	}
	public static void showBlood(Role role) { // 只要传入角色就行了
		System.out.printf("%s 血量 %d\n", role.getName(), role.getBlood());
	}
	
	// 重新定义行为
	public static void exp3() {
		/* 需求：
		 * 
		 * 请设计一个static方法，可以播放角色攻击动画。
		 * */
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		// 调用攻击
//		swordsMan.fight();
		
		Magician magician = new Magician();
		magician.setName("Monica");
		magician.setLevel(1);
		magician.setBlood(100);
		// 调用攻击
//		magician.fight();
		
		// 可以通过多态使用
		drawFight(swordsMan);
		drawFight(magician);
	}
	public static void drawFight(Role role) {
		// 调用的还是子类的 fight方法
		role.fight();
	}
	
	// 抽象方法，抽象类
	public static void exp4() {
		/* 上一个例子中 Role中的 fight() 实际没有撰写 任何程序代码，虽然满足了多态要求，但会引发问题是，没有强迫或者提示 子类一定要操作 fight()方法
		 * 
		 * 
		 * 如果某方法区块中，真的没有任何程序代码操作，可以使用abstract标示该方法为抽象方法
		 * 该方法可以直接;结尾
		 * 例如 AbsRole中的fight()方法
		 * */
		AbsRole role = new AbsRole() {
			@Override
			public void fight() {
				// TODO Auto-generated method stub
				System.out.println("必须用的时候完善抽象方法， 或者在子类中完善");
			}
		};
		role.fight();
		/* 子类如果继承抽象类
		 * 对于抽象方法，有两种做法：
		 * 1.一种继续标示 子类为 abstract
		 * 2.操作抽象方法（完善抽象方法）
		 * */ 
		SwordsMan2 swordsMan = new SwordsMan2();
		swordsMan.setName("Justin");
		swordsMan.setLevel(1);
		swordsMan.setBlood(200);
		swordsMan.fight();
	}
}
//+++++++++++++ +++++++++++++



