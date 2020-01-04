//package com.test;//放在同一包中，可以直接访问包
package com.test2;
import com.test.*;//不同包，用import来访问
class Test {
	public static void main(String []args) {
		System.out.println("--------init data--------");
		Cloth test = new Cloth(30, "red");
		System.out.println("size="+test.getSize()+", color="+test.getColor());
		System.out.println("----use method init data---");
		Cloth test2 = new Cloth();
		test2.setSize(40);
		test2.setColor("green");
		System.out.println("size="+test2.getSize()+", color="+test2.getColor());
	}
}
