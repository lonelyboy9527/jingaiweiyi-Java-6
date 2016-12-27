package cc.openhome.class1;

//为魔法师定义类， 继承自Role
public class Magician extends Role {
	
	@Override
	public void fight() { // 重写父类攻击方法
		// TODO Auto-generated method stub
//		super.fight();
		System.out.println("魔法攻击");
	}
	public void cure() {
		System.out.println("魔法治疗");
	}

}