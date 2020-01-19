java使用new操作符来创建数组。

### 一、数组与容器

#### ArrayTest.java

````java
import java.util.*;
class Comparison {
    private static long counter;
    private final long id = counter++;
    public String toString() {return "comp:"+id;}
    public long id() {return id;}
}

public class ArrayTest {
    public static void main(String[] args) {
        /*--------数组---------*/                                                                                                                                                                            
        System.out.println("-----数组------");
        Comparison[] comp = new Comparison[10];
        for(int i = 0; i < 5; i++)
            comp[i] = new Comparison();
        System.out.println(Arrays.toString(comp));
        System.out.println(comp[2].id());
        /*--------容器---------*/
        System.out.println("-----容器------");
        List<Comparison> compList = new ArrayList<Comparison>();
        for(int i = 0; i < 5; i++)
            compList.add(new Comparison());
        System.out.println(compList.get(4).toString());
        System.out.println(compList.get(4).id());
        /*--------int数组---------*/
        System.out.println("-----int数组------");
        int[] integers = {5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[3]);
        /*--------int容器---------*/
        System.out.println("-----int容器------");
        List<Integer> intList = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9));
        System.out.println(intList);
        System.out.println(intList.get(3));
    }
}
````

#### 结果

````bash
-----数组------
[comp:0, comp:1, comp:2, comp:3, comp:4, null, null, null, null, null]
2
-----容器------
comp:9
9
-----int数组------
[5, 6, 7, 8, 9]
8
-----int容器------
[5, 6, 7, 8, 9]
8
````

### 二、数组的使用

#### ArrayUse.java

````java
import java.util.*;
public class ArrayUse {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[8];
        /* 填充数组：fill的使用 */
        System.out.println("-----填充数组：fill的使用------");
        Arrays.fill(a, 11);//将数组a的数值全部填充为11
        Arrays.fill(b, 22);
        System.out.println("a="+Arrays.toString(a));
        System.out.println("b="+Arrays.toString(b));
        /* 复制数组：System.arraycopy的使用 */
        System.out.println("-----复制数组：System.arraycopy的使用------");
        System.arraycopy(a, 0, b, 0, a.length);//将a数组的第0位开始依次复制到b数组的第0位开始，直到a.length。
        System.out.println("b="+Arrays.toString(b));
        /* 数组比较:Arrays.equals */
        System.out.println("-----数组比较：Arrays.equals------");
        int c[] = new int[5];
        int d[] = new int[5];
        Arrays.fill(c, 33);
        Arrays.fill(d, 33);
        System.out.println("c = d:"+Arrays.equals(c, d));
        d[2] = 22;
        System.out.println("c != d:"+Arrays.equals(c, d));                                                                                                                                                   
        /* 数组排序:Arrays.sort */
        System.out.println("-----数组排序：Arrays.sort------");
        String[] str = {"Sttsdfs", "adffsdf", "Asdfsaf", "Swirl", "MintChip", "Mintss", "mint", "zsdfdsf"};
        System.out.println("before sort: "+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("after sort: "+Arrays.toString(str));
    }
}
````

#### 结果

````bash
-----填充数组：fill的使用------
a=[11, 11, 11, 11, 11]
b=[22, 22, 22, 22, 22, 22, 22, 22]
-----复制数组：System.arraycopy的使用------
b=[11, 11, 11, 11, 11, 22, 22, 22]
-----数组比较：Arrays.equals------
c = d:true
c != d:false
-----数组排序：Arrays.sort------
before sort: [Sttsdfs, adffsdf, Asdfsaf, Swirl, MintChip, Mintss, mint, zsdfdsf]
after sort: [Asdfsaf, MintChip, Mintss, Sttsdfs, Swirl, adffsdf, mint, zsdfdsf]
````

