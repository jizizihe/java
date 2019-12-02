package com.protectedtestthree;
import com.protectedtest.ProtectedTest;
public class ProtectedTestThree extends ProtectedTest{
	public static void main(String[] args){
		/* 子类实例可以访问自身继承的test方法!*/
		ProtectedTestThree getTest = new ProtectedTestThree();
		getTest.test();
		/* 编译会错误! 子类不可以访问父类实例的test方法!
		ProtectedTest getTest2 = new ProtectedTest();
		getTest2.test();
		*/
	}
}

