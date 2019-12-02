public class ThisTestOne {
	int test;

	ThisTestOne(int test) {//当这里的参数与类实例变量不同，可以不使用this来指定。
		this.test = test;
		/*当实例变量与参数存在歧义，使用this来指定当前类的实例变量。*/
		test = test;//当取消注释与删掉上一行代码时，返回值为0。
	}
	public void getTest() {
		System.out.println(test);
		/* this的隐式用法 */
		this.getTestMethod();//主动加入this（显式）
		getTestMethod();//编译器自动添加this关键字（隐式）
	}
	public void getTestMethod() {
		System.out.println("hello");
	}
	public static void main(String []args) {
	  	ThisTestOne value = new ThisTestOne(100);
		value.getTest();
	}	
}
