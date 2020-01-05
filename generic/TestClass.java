public class TestClass<J> {//以下J的类型为由外部指定，如Integer,String
	J j;
	
	public void setValue(J j) {
		this.j = j;
	}
	
	public J getValue() {//返回值类型为J
		return j;
	}

	public static void main(String []args) {
		//TestClass<int> a = new TestClass<int>();//会出错，泛型的类型只能是类类型，不能是简单类型
		TestClass<Integer> a = new TestClass<Integer>();
		TestClass<String> b = new TestClass<String>();
	
		a.setValue(1);
		b.setValue("test generic");
		System.out.println("int = "+a.getValue());
		System.out.println("char = "+b.getValue());
	}
}
