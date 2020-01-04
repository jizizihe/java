多态为java的三大特性之一，了解学习多态，将更了解java。

### 多态实现条件

-   继承与重写（方法的多态性）
-   接口（对象的多态性）
-   抽象类与抽象方法（对象的多态性）

### 向上转型和向下转型

-   向上转型：父类 父类对象 = 子类实例
-   向下转型：子类 子类对象 = （子类）父类对象
-   当父类需要调用子类的扩充方法时才需要向下转型
-   向下转型之前必须要先向上转型

### Test.java

```java
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
```

### 运行结果

![image-20200104111509706](/home/jzzh/.config/Typora/typora-user-images/image-20200104111509706.png)