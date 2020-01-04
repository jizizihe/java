abstract class A {//抽象类的多态
	abstract void printA();
}

class TestA extends A {
	void printA() {
		System.out.println("class TestA extends abstract A");
	}
	void printTestA() {
		System.out.println("printTestA methods");
	}
}

interface B {//接口的多态
	void printB();
}

class TestB implements B {
	public void printB() {
		System.out.println("class TestB implements B");
	}
	void printTestB() {
		System.out.println("printTestB methods");
	}
}

public class Test {
	public static void main(String []args){
		System.out.println("---------A-------");
		A a = new TestA();//向上转型：父类 父类对象 = 子类实例
		a.printA();
		//testa.printTestA();//会报错，向上转型，因为父类访问不了子类中方法
		TestA testa = (TestA)a;//向下转型：子类 子类对象 = （子类）父类实例，向下转型和向上转型是一体的
		testa.printTestA();
		System.out.println("---------B-------");
		TestB testb = new TestB();//不想用向上向下转型可直接用子类实现
		testb.printB();
		testb.printTestB();
	}
}
