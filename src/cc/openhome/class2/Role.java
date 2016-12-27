package cc.openhome.class2;

public abstract class Role {
	/* 被声明为 protected的成员
	 * 
	 * 相同包中的类可以直接存取。
	 * 不同包中的类可以在继承后的子类中直接存取。
	 * */
	protected String name;		// 角色名称
	protected int level;		// 角色等级
	protected int blood;		// 角色血量
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
	
	protected String eat() {
		return "要吃东西了:";
	}
	
	// 返回一个  Role的实例
	public Role copy() {
		return new Role() {
			@Override
			public void fight() {
				// TODO Auto-generated method stub
			}
		};
	}
}
