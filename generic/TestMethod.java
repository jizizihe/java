public class TestMethod {
	public static <J> void printValue(J inputValue) {//泛型方法：类型参数声明<J>在方法返回类型void之前
		System.out.println(inputValue);
	}

	public static void main(String []args) {
		int a = 10;
		char b = 't';
		double c = 2.22;
		System.out.println("----int----");
		printValue(a);
		System.out.println("----char----");
		printValue(b);
		System.out.println("----double----");
		printValue(c);
	}
}
