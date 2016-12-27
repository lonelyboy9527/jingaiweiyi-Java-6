package cc.openhome.class1;

public class Role {
	private String name;	// 角色名称
	private int level;		// 角色等级
	private int blood;		// 角色血量
	
	public void fight() {
		
	}
	
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
}


