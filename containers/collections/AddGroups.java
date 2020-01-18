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
