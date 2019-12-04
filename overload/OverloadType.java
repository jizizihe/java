public class OverloadType {
	public int test(int a, int b) {
		return a + b;
	}
	/* 类型不同，重载到对应方法中 */
	public int test(char a, char b) {
		return a + b;//ASCII码值相加
	}

	public static void main(String[] args) {
		OverloadType get = new OverloadType();
		System.out.println(get.test(1, 1));
		System.out.println(get.test('2', '2'));
	}
}

