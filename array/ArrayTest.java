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
