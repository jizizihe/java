package com.protectedtest;
public class ProtectedTestTwo extends ProtectedTest{
	public static void main(String[] args){
		/* 子类实例可以访问自身继承的test方法 */	
		ProtectedTestTwo getTest = new ProtectedTestTwo();
		getTest.test();
		/* 子类可以访问父类实例的test方法 */
		ProtectedTest getTest2 = new ProtectedTest();
		getTest2.test();
	}
}

