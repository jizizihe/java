public class OuterClass {
	public static void helloPrint()
	{
		System.out.println("hello wold");
	}

	public static class InnerClass {
		public static int staticVariable;

		public static int getStaticVariable() {
			helloPrint();//成员内部类可以访问外部类的成员变量和方法。
    	    return staticVariable;
    	}

    	public static void setStaticVariable(int value) {
    	    staticVariable = value;
    	}
	}

	public static void main(String[] args) {
		// 可以使用关键字new创建一个类的实例
		/*
		InnerClass hello = new InnerClass();
		hello.setStaticVariable(10);
		System.out.println(hello.getStaticVariable());
		*/
		/* 可以直接通过OuterClass来访问，而不需要创建OuterClass的实例 */
		InnerClass.setStaticVariable(10);
		System.out.println(InnerClass.getStaticVariable());
	}
}
