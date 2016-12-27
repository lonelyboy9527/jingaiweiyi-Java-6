package cc.openhome.class2;

import com.sun.org.apache.regexp.internal.recompile;

public class Cat {
	public String name;
	public int age;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object other) {
		// 如果other参考的就是这个对象，当然是同一个对象。
		if (this == other) {
			return true;
		}
		/* other参考的对象不是Cat创建出来的
		 * 
		 * 例如是 Dog创建出来的
		 * */
		if (!(other instanceof Cat)) { // instanceof 判断是某个类的实例 (类似OC 的isKindClass，子类对象也是true)
			return false;
		}
		
		/* other参考的对象是Cat创建出来的
		 * 如果名称和年龄相同，表示两个对象实质上相等
		 * */
		Cat cat = (Cat) other;
		if (!getName().equals(cat.getName())) {
			return false;
		}
		if (getAge() != cat.getAge()) {
			return false;
		}
		return true;
	}
}
