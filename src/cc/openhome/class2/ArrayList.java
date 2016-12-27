package cc.openhome.class2;

import java.util.Arrays;

public class ArrayList {
	private Object[] list;
	private int next;
	
	// 构造数组，指定初始容量
	public ArrayList (int capacity) {
		list = new Object[capacity];
	}
	public ArrayList() {
		this(16); // 初始容量默认为16
	}
	// 数组增加元素
	public void add(Object o) { 
		if (next == list.length) { // 自动增长数组长度
			list = Arrays.copyOf(list, list.length * 2);
		}
		list[next++] = o; // 每一次收集的对象会放在next指定的索引处
	}
	// 根据索引取得对象
	public Object get(int index) { 
		return list[index];
	}
	// 数组大小
	public int size() {
		return next;
	}
	
}
