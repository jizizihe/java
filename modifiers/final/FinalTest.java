public class FinalTest {
	final int value = 10; //实例变量
	final int value2;

	public FinalTest() {
		value2 = 10;//不会报错，在构造方法可以直接赋值。
		System.out.println("value2=: " + value2);	
	}
	public void test() {
		int value = 9;//局部变量：不会报错，因为重新赋值给int类型了。
		//value = 9; //报错，final定义的变量不能重新赋值。
		//value2 = 8;//报错，不能在方法中赋值
		System.out.println("value=: " + value);	
	}
	public static void main(String []args) {
		FinalTest getText = new FinalTest();
		getText.test();
	}
}

