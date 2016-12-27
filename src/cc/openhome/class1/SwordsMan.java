package cc.openhome.class1;

//定义了剑士类, 继承自Role
/* extends: 表示 SwordsMan会扩充Role的行为*/
public class SwordsMan extends Role {

	/* @Override
	 * 
	 * JD5之后出现标注，其中一个内建的标注就是 @Override，
	 * 
	 * 如果在子类中某个方法前标注@Override，表示要求编译器检查，该方法是不是真的重新定义了父类中某个方法，如果不是的话，就会引发编译错误
	 * 
	 * 能够防止 打错方法名，以至于没有重写方法。
	 * 
	 * */ 
	
	@Override 
	public void fight() { // 重写父类攻击方法
		// TODO Auto-generated method stub
//		super.fight(); 可以不调用
		System.out.println("挥剑攻击");
	}

}