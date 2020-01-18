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
