主要学习的集合类如下

-   Collection ：一个独立元素的序列。List（列表）按顺序插入、Set（集合）不能有重复元素
-   Map（映射）：一组成对的“键值对”对象，使用键来查找值。

### 一、ArrayList类

****

#### *ArrayListTest.java*

```java
import java.util.*;                                                                                                                                                                                          
class Apple {//没有显示继承哪个类，默认继承Object类
    private static long counter;
    private final long id = counter++;
    public long id () { return id; }
}

public class ArrayListTest {
    //@SuppressWarnings("unchecked")//注解：抑制编译器产生警告信息。
    public static void main(String[] args) {
        //ArrayList apples = new ArrayList();
        ArrayList<Apple> apples = new ArrayList<Apple>();//使用泛型
        for(int i = 0; i < 3; i++)
            apples.add(new Apple());
        for(int i= 0; i < apples.size(); i++)
            //apples.get(i).id();得到Object引用，按下面Apple然后括号括起来，否则会报错
            //System.out.println(((Apple)apples.get(i)).id());
            System.out.println(apples.get(i).id());//使用泛型可直接打印
    }
}
```

#### _结果_

```bash
0
1
2
```

### 二、添加一组元素

****

#### **AddGroups.java**

````java
import java.util.*;
public class AddGroups {
    public static void main(String[] args) {
        /* Arrays.asList()方法来添加一个数组或者是一个用逗号分隔的元素列表,为List对象*/
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        for(int i : collection) {
            System.out.println("use Arrays.asList"+i);
        }
        /* Collections.addAll()方法来接受一个Collection对象，以及添加一个数组或者是一个用逗号分隔的元素列表，添加到Collection中*/
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        for(int i : collection) {
            System.out.println("use Collections.addAll:"+i);                                                                                                                                                 
        }
    }
}
````

### __结果__：

````bash
use Arrays.asList1
use Arrays.asList2
use Arrays.asList3
use Arrays.asList4
use Arrays.asList5
use Arrays.asList6
use Arrays.asList7
use Arrays.asList8
use Arrays.asList9
use Arrays.asList10
use Collections.addAll:1
use Collections.addAll:2
use Collections.addAll:3
use Collections.addAll:4
use Collections.addAll:5
use Collections.addAll:6
use Collections.addAll:7
use Collections.addAll:8
use Collections.addAll:9
use Collections.addAll:10
use Collections.addAll:11
use Collections.addAll:12
use Collections.addAll:13
use Collections.addAll:14
use Collections.addAll:15
use Collections.addAll:6
use Collections.addAll:7
use Collections.addAll:8
use Collections.addAll:9
use Collections.addAll:10
````

### 三、容器的打印

----

#### ***PrintContainers.java***

````java
import java.util.*;

public class PrintContainers {
    static Collection printTest(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map printTest(Map<String,String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }
    public static void main(String[] args) {
        System.out.println("--------list-------");//列表：按顺序保存一组元素
        System.out.println(printTest(new ArrayList<String>()));//随机访问快，插入和删除比较慢
        System.out.println(printTest(new LinkedList<String>()));//随机访问慢，插入和删除比较快，常用于堆栈和队列
        System.out.println("--------set-------");//集合：没有重复元素，也没有顺序
        //最快获取元素,下面的Map也是。
        System.out.println(printTest(new HashSet<String>()));
        //按比较结果升序保存对象,下面的Map也是。
        System.out.println(printTest(new TreeSet<String>()));
        //按添加的顺序保存对象，同时保留了查询速度,下面的Map也是。                                                                                                                                           
        System.out.println(printTest(new LinkedHashSet<String>()));
        System.out.println("--------map-------");//映射表：一组成对的“键值对”对象，使用键来查找值
        System.out.println(printTest(new HashMap<String,String>()));
        System.out.println(printTest(new TreeMap<String,String>()));
        System.out.println(printTest(new LinkedHashMap<String,String>()));
    }
}
````

#### ___结果___

````bash
--------list-------
[rat, cat, dog, dog]
[rat, cat, dog, dog]
--------set-------
[rat, cat, dog]
[cat, dog, rat]
[rat, cat, dog]
--------map-------
{rat=Fuzzy, cat=Rags, dog=Spot}
{cat=Rags, dog=Spot, rat=Fuzzy}
{rat=Fuzzy, cat=Rags, dog=Spot}
````

### 四、迭代器

------

####  *SimpleIterator.java*

````java
import java.util.*;
public class SimpleIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("study","java", "iterator"));
        Iterator<String> it = list.iterator();
        while(it.hasNext())//检查容器中是否还有元素
            System.out.println("print element:"+it.next());
        System.out.println("print List element:"+list);
        it = list.iterator();//因为it迭代器在上面一行中读到了最后一位，所以需要重新初始化迭代器一次才能继续读。                                                                                              
        for(int i = 0;i < 3; i++) {
            it.next();//获得容器中下一个元素
            it.remove();//将迭代器新近方回的元素删除，因此在remove()之前必须调用next()
        }
        System.out.println("print List element:"+list);
    }
}
````

#### _结果_：

````bash
print element:study
print element:java
print element:iterator
print List element:[study, java, iterator]
print List element:[]
````

