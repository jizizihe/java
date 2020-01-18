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
