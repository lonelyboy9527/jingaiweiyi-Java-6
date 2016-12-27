package cc.openhome.class1;

/* 
 * 类中有方法abstract，就表示这个类定义不完整，定义不完整的类就不能生成实例
 * （好比一张设计图纸，设计图不完整就不能生产成品一样。）
 * 
 * Java中规定内含抽象方法的类，一定要在 class前标示 abstract
 * 
 * */
public abstract class AbsRole {
	private String name;	// 角色名称
	private int level;		// 角色等级
	private int blood;		// 角色血量
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	
	// 定义一个抽象方法
	public abstract void fight();
}
