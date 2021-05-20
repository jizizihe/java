package com.aijiao.test;

public class JNIDemo {
	//定义一个方法，该方法在C中实现
	public native void testHello();

	public static void main(String[] args){
		//加载C文件
		System.loadLibrary("TestJni");
		JNIDemo jniDemo = new JNIDemo();
		jniDemo.testHello();
	}
}
