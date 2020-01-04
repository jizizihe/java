public class TestFour {
	public int test = 1;
	private int test2 = 2;

	public void printTest() {
		class InnerFour {//局部内部类：声明在一个方法体内部。只能在方法体内部使用。
			public int innerValue = 3;
			private int innerValue2 = 4;

			public InnerFour() {
				System.out.println("test="+test);
				System.out.println("test2="+test2);
			}
		}

		InnerFour inner = new InnerFour();
		System.out.println("innerValue="+inner.innerValue);
		System.out.println("innerValue2="+inner.innerValue2);
	}

	public static void main(String []args) {
		TestFour testObj = new TestFour();
		testObj.printTest();
	}
}

