public class TestThree {
	public int test = 1;
	private int test2 = 2;

	public void printTest() {
		InnerThree inner = new InnerThree() {//new创建匿名内部类实现接口的方法,然后赋值给Inner对象
			int innerValue = 3;//只能在匿名内部类使用
			public void printThree() {
				System.out.println("---override printThree method----");
				System.out.println("test="+test);
				System.out.println("test2="+test2);	
			}
		};	
		inner.printThree();//执行重写的方法
		//System.out.println("inner="+inner.innerValue);//无法使用匿名内部类的变量,因为外部类无法获取当前匿名内部类的类名。
	}

	interface InnerThree {//匿名内部类：主要是针对抽象类和接口
		void printThree();
	}

	public static void main(String []args) {
		TestThree testObj = new TestThree();
		testObj.printTest();
	}
}

