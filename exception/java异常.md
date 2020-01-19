所有异常都是继承java.lang.Exception类。Exception类与Error类是Throwable类的子类

#### 一、异常类

-   检查性异常类Exception:必须使用try…catch进行处理
-   运行时异常类RuntimeException:  可以不使用try...catch进行处理。

### 二、异常捕获

#### ExceptionTest.java

````java
import java.io.*;
public class ExceptionTest {
     // 在主方法中的所有异常都可以不使用try...catch进行处理。                                                                                                                                                
    public static void main(String[] args) {
        try{
            /* 执行第一个异常*/
            //int a[] = new int[5];
            //System.out.println("access element 6:"+x[6]);
            /* 执行第二个异常 */
            Object[] x = new String[3];
            x[0] = new Integer(0);
        }catch(ArrayIndexOutOfBoundsException e) {//非法索引访问数组时抛出异常
            System.out.println("exception throw:"+e);
        }catch(ArrayStoreException f) {//将错误类型的对象存储到一个对象数组时抛出异常
            System.out.println("exception throw2:"+f);
        }
        System.out.println("----end try catch----");

    }
}
````

#### 结果

````bash
exception throw2:java.lang.ArrayStoreException: java.lang.Integer
----end try catch----
````

### 三、异常抛出

#### ExceptionThrows.java

````java
import java.io.*;
class Value {
    public int getValue(int a, int b) throws Exception{
        int ret = a/b;
        return ret;
    }
}

public class ExceptionThrows {
     // 在主方法中的所有异常都可以不使用try...catch进行处理。
    public static void main(String[] args) {
        Value value = new Value();
        //value.getValue(20, 2);//编译报错：方法通过throws声明，所以方法必须通过try..catch来处理处理。                                                                                                       
        System.out.println("-----throws-----");
        try{
            System.out.println("getvalue:"+value.getValue(20, 2));
            System.out.println("getvalue:"+value.getValue(20, 0));//抛出异常，因为0不能作除数
        }catch(Exception e) {
            System.out.println("exception throw:"+e);
            e.printStackTrace();
        }
        System.out.println("-----throw-----");
        try{
            throw new Exception("example throw exception");//主动抛出异常，可通过try..catch来处理异常
        }catch(Exception f) {
            f.printStackTrace();
        }

    }
}
````

#### 结果

````bash
-----throws-----
getvalue:10
exception throw:java.lang.ArithmeticException: / by zero
java.lang.ArithmeticException: / by zero
	at Value.getValue(ExceptionThrows.java:4)
	at ExceptionThrows.main(ExceptionThrows.java:17)
-----throw-----
java.lang.Exception: example throw exception
	at ExceptionThrows.main(ExceptionThrows.java:24)
````

### 四、异常联合使用

#### ExceptionFinally.java

````java
import java.io.*;
class ValueFinally {
    public int getValue(int a, int b) throws Exception{
        int ret = 0;
        try{
            ret = a/b;
        }catch(Exception e){
            System.out.println("main exception not throw:"+e);//在main中异常并没有抛出,之在方法中抛出异常
            throw e;//在main中异常正常抛出。
        }finally{//无论是否发生异常都会执行finally块中的代码
            System.out.println("-----end-----");
        }
        return ret;
    }
}

public class ExceptionFinally {
    public static void main(String[] args) {
        ValueFinally value = new ValueFinally();
        try{
            System.out.println("getvalue:"+value.getValue(20, 0));//抛出异常，因为0不能作除数
        }catch(Exception e) {//抛出所有异常
            System.out.println("get exception throw:"+e);
        }
    }
} 
````

#### 结果

````bash
main exception not throw:java.lang.ArithmeticException: / by zero
-----end-----
get exception throw:java.lang.ArithmeticException: / by zero
````

### 五、自定义异常

#### MyExceptionTest.java

````java
import java.io.*;
class MyException extends Exception {//自定义检查异常类,必须通过try..catch来处理异常。
    //如果是自定义运行时异常类，需要继承RuntimeException类，可以不使用try..catch处理异常，由jvm自动处理。
    public MyException(String msg) {
        super(msg);//调用父类的构造方法                                                                                                                                                                      
    }
}
public class MyExceptionTest {
    public static void main(String[] args) {
        try{
            throw new MyException("自定义异常");
        }catch(Exception e) {
            System.out.println("MyException throw:"+e);
        }
    }
}
````

#### 结果

````bash
MyException throw:MyException: 自定义异常
````

