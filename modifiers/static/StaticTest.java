public class StaticTest {
	private static int num = 0;////“静态变量（类变量）”不能被使用在类的非静态方法中。
	public static int getNum() {
		//static int num = 2;  //static变量为类变量，局部变量不能声明为static变量
		return num;
	}

	public static void add() { //“静态方法”不能使用类的非静态变量。
		num++;
	}

	public static void main(String[] args) {
		System.out.println("num:" + StaticTest.getNum() + " start");
		for (int i = 0; i < 10; ++i){
			add();//不属于任何对象，即使没有创建对象，也能使用变量和调用方法
		}
		System.out.println("num:" + StaticTest.getNum() + " end");
	}
}
