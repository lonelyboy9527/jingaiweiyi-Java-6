package cc.openhome.class2;

public class Magician extends Role {

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("魔法攻击");
	}
	
	public String toString() {
		return String.format("魔法师 (%s, %d, %d)", this.name, this.level, this.blood);
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return super.eat() + "魔法石";
	}
}
