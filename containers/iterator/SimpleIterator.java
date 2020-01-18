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
