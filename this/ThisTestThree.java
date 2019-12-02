public class ThisTestThree {
	int i = 0, j = 10;

	void getValue() {
		System.out.println(j);
	}
	/* 因为是data类类型，所以可以直接调用方法getValue */
	void test(ThisTestThree data) {
		data.getValue();
	}
	/* this作为参数传递给方法，此参数为类类型*/
	void getTest() {
		test(this);
	}
	/* this作为返回值，返回值类型为类类型 */
	ThisTestThree returnTest () {
		i++;
		return this;	
	}
	void testReturn () {
		System.out.println(i);
	}
	public static void main(String []args) {
	  	ThisTestThree value = new ThisTestThree();
		value.getTest();
		/* 通过一条语句对同一个对象进行多个操作 */
		value.returnTest().testReturn();
	}	
}
