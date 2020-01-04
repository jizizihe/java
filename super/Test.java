class A {
	int value = 10;
	
	A () {
		System.out.println("class A");
	}

	void printA() {
		System.out.println("method printA");
	}
}

class Test extends A{
	int value = 20;
	
	Test () {//构造器来调用父类构造器
		super();
	}

	void printValue() {//实例变量来引用父类实例变量
		System.out.println(value);
		System.out.println(super.value);
	}

	void printA() {
		System.out.println("class Test extends A");
	}

	void printTest() {//方法来调用父类方法
		printA();
		super.printA();
		System.out.println("method printTest");
	}

	public static void main(String []args) {
		Test test = new Test();
		test.printValue();
		test.printTest();
	}
} 
