封装为java三大特性之一。顾名思义，就是将需要的变量以及方法封装起来，外界无法直接操作和修改，只能用pulic修饰符指定的变量及方法来访问。增强其代码的安全性。

### 封装

-   使用private修饰符来修饰成员变量或者方法。
-   使用public修饰符来修饰成员变量或方法来提供共有接口，以供访问其private的私有数据。
-   使用==this==来指定其实例变量，将实例变量与参数设为同名。
-   使用==构造方法==来初始化private私有数据，或者通过==public修饰的变量及方法==来初始化private私有数据。

### Cloth.java

```java
package com.test;
public class Cloth {
    private int size;
    private String color;

    public Cloth(){}
    public Cloth(int size,String color) {//利用构造方法来初始化变量
        this.size = size;//方法被哪个对象调用，this就指向那个对象。这里是实例变量size.
        this.color = color;                                                                                                                                                                                  
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
```

执行下列命令，在当前目录创建一个包与Cloth类。

```shell
javac -d . Cloth.java
```

### Test.java

```java
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
```

### 运行结果

![image-20200104162232012](/home/jzzh/.config/Typora/typora-user-images/image-20200104162232012.png)