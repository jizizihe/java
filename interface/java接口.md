接口常用来实现抽象,多继承，松耦合。

### 接口

----

-   接口用**interface**来修饰
-   接口没有构造方法
-   接口不能用于实例化对象
-   接口不是被类继承了，而是要被类实现
-   接口可以继承接口，支持多继承
-   接口中方法默认为**public abstract**，jdk1.8以后可以使用静态方法及方法

### Test.java

---

```java
interface A {
	void printA();//接口的方法默认指定为public abstract（抽象方法），变量默认指定为public static final
	
	static int add(int value) {//jdk1.8以后有静态方法
		return value + value;
	}
}

class TestA implements A {
	public void printA() { //
		System.out.println("test A implements A");
	}
}
/* test b */
interface B {
	void printB();
}

class TestB implements A,B {//接口不能被类继承，而是被类实现
	public void printA() {//方法体必须加public修饰，不然编译报错
		System.out.println("test B implements A");
	}
	public void printB() {
		System.out.println("test B implements B");
	}
}
/* test c */
interface C extends A,B{//接口可以继承接口，支持多继承
	void printA();
	void printB();
	void printC();
}

class TestC implements C {
	public void printA() {
		System.out.println("test C implements C extends A");
	}
	public void printB() {
		System.out.println("test C implements C extends B");
	}
	public void printC() {
		System.out.println("test C implements C");
	}
}

public class Test {
	public static void main(String []args) {
		System.out.println("-----A-----");
		//A testa = new A(); //接口不能实例化对象，没有构造方法
		A testa = new TestA();
		testa.printA();
		//System.out.println(testa.add(10)); //不能被类实现
		System.out.println(A.add(10));//只能通过接口实现
		System.out.println("-----B-----");
		TestB testb = new TestB();
		testb.printA();
		testb.printB();
		System.out.println("-----C-----");
		TestC testc = new TestC();
		testc.printA();
		testc.printB();
		testc.printC();
	}	
}
```

### 运行结果

---

![image-20200102230058949](/home/jzzh/.config/Typora/typora-user-images/image-20200102230058949.png)