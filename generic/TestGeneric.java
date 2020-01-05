import java.util.*;
public class TestGeneric {
	public static void printValue(List<?> inputValue) {
		System.out.println(inputValue.get(0));
	}

	public static void getNumber(List<? extends Number> number) {//上边界限定通界符
		System.out.println(number.get(0));
	}

	public static void getSuper(List<? super String> superValue) {//下边界限定通界符：
		System.out.println(superValue.get(0));
	}

	public static void main(String []args) {
		List<Integer> a = new ArrayList<Integer>();
		List<String> b = new ArrayList<String>();
		a.add(10);
		b.add("test generic");
		System.out.println("-----<?>--------");
		printValue(a);
		printValue(b);
		System.out.println("-----<? extends T>--------");
		getNumber(a);//Integer属于Number类所以来编译通过
		//getNumber(b);//无法编译通过。因为b是String类。
		System.out.println("-----<? super T>--------");
		//getSuper(a);//无法编译通过，因为已经<? super String>限定为String类了。
		getSuper(b);//和上面一样，无法编译过。
	}
}
