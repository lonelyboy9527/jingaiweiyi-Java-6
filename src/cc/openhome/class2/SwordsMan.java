package cc.openhome.class2;

public class SwordsMan extends Role {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("挥剑攻击");
	}
	
	public String toString() {
		return String.format("剑士 (%s, %d, %d)", this.name, this.level, this.blood);
	}
	
	// 子类重写时，可以扩大权限为 public (但是父类方法不能是 private)
	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return super.eat() + "馒头";
	}
	
	// 重写，返回SwordsMan实例
	@Override
	public SwordsMan copy() {
		// TODO Auto-generated method stub
		SwordsMan swordsMan = new SwordsMan();
		swordsMan.name = this.name;
		swordsMan.level = this.level;
		swordsMan.blood = this.blood;
		return swordsMan;
	}
}
