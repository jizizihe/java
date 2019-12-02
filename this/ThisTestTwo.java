public class ThisTestTwo {
	int test;
	
	ThisTestTwo() {
		this(50);//必须是第一个语句,不然编译会错误。	
		System.out.println("use this");
	}
	ThisTestTwo(int test) {
		System.out.println(test);
	}
	ThisTestTwo(String test2) {
		this();
		System.out.println(test2);
	}
	public static void main(String []args) {
	  	ThisTestTwo value = new ThisTestTwo();//不带参数传递
	  	ThisTestTwo value2 = new ThisTestTwo("test");//带参数传递
	}	
}
