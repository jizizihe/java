public class OverloadNum {
	public int test(int a, int b) {
		return a + b;
	}
	/* 参数数量不同,重载的到对应的方法中 */
	public int test(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		OverloadNum get = new OverloadNum();
		System.out.println(get.test(1, 1));
		System.out.println(get.test(2, 2, 2));
	}
}

