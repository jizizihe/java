abstract class A {
	A() {
		System.out.println("adstract created");
	}
	abstract void example();//如果一个类包含抽象方法,那么该类必须是抽象类,也就是A必须是抽象类
	void method() {//成员方法,成员变量,构造方法的访问方式都是和普通类一样
		System.out.println("method created");
	}
}
class B extends A {
	void example() {//抽象类子类必须给出抽象中抽象方法的具体实现,除非该类也是抽象类
		System.out.println("adstract method overload of B");
	}
}
class C extends A {
	void example() {
		System.out.println("adstract method overload of C");
	}
}

public class Test {
	public static void main(String []args) {
		//A error = new A(); //抽象类不能被实例化,不能被NEW
		System.out.println("-----B-----");
		A test = new B();
		test.example();
		test.method();
		System.out.println("-----C-----");
		A test2 = new C();
		test2.example();
		test.method();
	}
}
