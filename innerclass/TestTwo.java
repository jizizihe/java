public class TestTwo {
	public static int test = 1;
	private static int test2 = 2;//必须是静态变量：静态变量无法访问外部类变量

	public TestTwo() {
		/* 静态内部类innerObj对象不需要依赖外部类对象testObj */
   /*     InnerTwo innerObj = new InnerTwo();*/
		//System.out.println("inner="+innerObj.inner);
		/*System.out.println("inner2="+innerObj.inner2);*/
	}

	public static class InnerTwo {//静态内部类
		public int inner = 3;
		private static int inner2 = 4;//可使用静态变量
		
		public InnerTwo() {
			System.out.println("test="+test);
			System.out.println("test2="+test2);
		}
	}
	public static void main(String []args) {
		TestTwo testObj = new TestTwo();
		InnerTwo innerObj = new InnerTwo();
		System.out.println("inner="+innerObj.inner);
		System.out.println("inner2="+innerObj.inner2);
	}
}

