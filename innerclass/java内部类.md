内部类：一个类的定义放在另一个类的定义内部。

### 内部类

-   普通内部类：普通内部类对象需要依赖外部类对象
-   静态内部类：静态内部类对象不需要依赖外部类对象
-   匿名内部类：主要是针对抽象类和接口，重写其方法。
-   局部内部类：声明在方法体内，不在方法体内无法使用其类。

### 普通内部类 TestOne.java

```java
public class TestOne {
    public int test = 1;
    private int test2 = 2;

    public TestOne() {
        InnerOne innerObj = new InnerOne();
        //外部类对象也可以通过内部类的对象引用来访问内部类中定义的所有访问权限的字段
        System.out.println("inner="+innerObj.inner);
        System.out.println("inner2="+innerObj.inner2);
    }

    public class InnerOne {//普通内部类：依赖内部类TestOne                                                                                                                                                   
        public int inner = 3;
        private int inner2 = 4;
        //内部类对象可以访问外部类对象中所有访问权限的字段. 
        public InnerOne() {
            System.out.println("test="+test);
            System.out.println("test2="+test2);
        }
    }
    public static void main(String []args) {
        TestOne testObj = new TestOne();
        /* static是独立于类的任何一个对象。所以不在外部类TestOne时，
        指名外部类对象testObj，再使用内部类InnerOne */
        /*
        InnerOne innerObj = testObj.new InnerOne();
        System.out.println("inner="+innerObj.inner);
        System.out.println("inner2="+innerObj.inner2);
        */
    }
}
```

#### 运行结果

![image-20200104205314096](/home/jzzh/.config/Typora/typora-user-images/image-20200104205314096.png)

### 静态内部类 TestTwo.java

```java
public class TestTwo {
    public static int test = 1;
    private static int test2 = 2;//必须是静态变量：静态变量无法访问外部类变量                                                                                                                                

    public TestTwo() {
        /* 静态内部类innerObj对象不需要依赖外部类对象testObj */
   /*     InnerTwo innerObj = new InnerTwo();*/
        //System.out.println("inner="+innerObj.inner);
        /*System.out.println("inner2="+innerObj.inner2);*/
    }

    public static class InnerTwo {//静态内部类
        public int inner = 3;
        private static int inner2 = 4;//可使用静态变量

        public InnerTwo() {
            System.out.println("test="+test);
            System.out.println("test2="+test2);
        }
    }
    public static void main(String []args) {
        TestTwo testObj = new TestTwo();
        InnerTwo innerObj = new InnerTwo();
        System.out.println("inner="+innerObj.inner);
        System.out.println("inner2="+innerObj.inner2);
    }
}
```

#### 运行结果

![image-20200104205510259](/home/jzzh/.config/Typora/typora-user-images/image-20200104205510259.png)

### 匿名内部类 TestThree.java

```java
public class TestThree {
    public int test = 1;
    private int test2 = 2;

    public void printTest() {
        InnerThree inner = new InnerThree() {//new创建匿名内部类实现接口的方法,然后赋值给Inner对象
            int innerValue = 3;//只能在匿名内部类使用
            public void printThree() {
                System.out.println("---override printThree method----");
                System.out.println("test="+test);
                System.out.println("test2="+test2);
            }
        };
        inner.printThree();//执行重写的方法
        //System.out.println("inner="+inner.innerValue);//无法使用匿名内部类的变量,因为外部类无法获取当前匿名内部类的类名。
    }

    interface InnerThree {//匿名内部类：主要是针对抽象类和接口                                                                                                                                               
        void printThree();
    }

    public static void main(String []args) {
        TestThree testObj = new TestThree();
        testObj.printTest();
    }
}
```

#### 运行结果

![image-20200104205700665](/home/jzzh/.config/Typora/typora-user-images/image-20200104205700665.png)

### 局部内部类 TestFour.java

```java
public class TestFour {
    public int test = 1;
    private int test2 = 2;

    public void printTest() {
        class InnerFour {//局部内部类：声明在一个方法体内部。只能在方法体内部使用。                                                                                                                          
            public int innerValue = 3;
            private int innerValue2 = 4;

            public InnerFour() {
                System.out.println("test="+test);
                System.out.println("test2="+test2);
            }
        }

        InnerFour inner = new InnerFour();
        System.out.println("innerValue="+inner.innerValue);
        System.out.println("innerValue2="+inner.innerValue2);
    }

    public static void main(String []args) {
        TestFour testObj = new TestFour();
        testObj.printTest();
    }
}
```

#### 运行结果

![image-20200104205841868](/home/jzzh/.config/Typora/typora-user-images/image-20200104205841868.png)