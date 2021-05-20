#### 1、编写java测试类

````java
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
````

然后编译此java

````shell
javac -d . JNIDemo.java
javah -classpath . -jni com.aijiao.test.JNIDemo
````

#### 2、编写c++语言

创建TestJni.cpp

````c++
#include "com_aijiao_test_JNIDemo.h"
#include <iostream>
#include <stdio.h>

JNIEXPORT void JNICALL Java_com_aijiao_test_JNIDemo_testHello
(JNIEnv *, jobject) {
        printf("this is C++ print\n");
}
````

执行命令如下：

```shell
mkdir testjni
cp com_aijiao_test_JNIDemo.h testjni/ -a && cd testjni/
g++ -fPIC -I /usr/lib/jvm/java-8-oracle/include/ -I /usr/lib/jvm/java-8-oracle/include/linux/ -shared -o libTestJni.so TestJni.cpp #注意这里生成的库必须以lib开头。cpp就需要g++编译
cp libTestJni.so  ../ -a && cd ../
java -Djava.library.path=. com.aijiao.test.JNIDemo #-Djava.library.path=.制定库在当前路径
```

运行成功，如下图：

![image-20210520165923682](./image/image-20210520165923682.png)