public class TestOne {
	public int test = 1;
	private int test2 = 2;

	public TestOne() {
		InnerOne innerObj = new InnerOne();
		//外部类对象也可以通过内部类的对象引用来访问内部类中定义的所有访问权限的字段
		System.out.println("inner="+innerObj.inner);
		System.out.println("inner2="+innerObj.inner2);
	}

	public class InnerOne {//普通内部类：依赖内部类TestOne
		public int inner = 3;
		private int inner2 = 4;
		//内部类对象可以访问外部类对象中所有访问权限的字段.	
		public InnerOne() {
			System.out.println("test="+test);
			System.out.println("test2="+test2);
		}
	}
	public static void main(String []args) {
		TestOne testObj = new TestOne();
		/* static是独立于类的任何一个对象。所以不在外部类TestOne时，
		指名外部类对象testObj，再使用内部类InnerOne */
		/*
		InnerOne innerObj = testObj.new InnerOne();
		System.out.println("inner="+innerObj.inner);
		System.out.println("inner2="+innerObj.inner2);
		*/
	}
}

