import java.io.*;
class Value {
	public int getValue(int a, int b) throws Exception{
		int ret = a/b;
		return ret;
	}
}

public class ExceptionThrows {
	 // 在主方法中的所有异常都可以不使用try...catch进行处理。
	public static void main(String[] args) {
		Value value = new Value();
		//value.getValue(20, 2);//编译报错：方法通过throws声明，所以方法必须通过try..catch来处理处理。
		System.out.println("-----throws-----");
		try{
			System.out.println("getvalue:"+value.getValue(20, 2));
			System.out.println("getvalue:"+value.getValue(20, 0));//抛出异常，因为0不能作除数
		}catch(Exception e) {
			System.out.println("exception throw:"+e);
			e.printStackTrace();
		}
		System.out.println("-----throw-----");
		try{
			throw new Exception("example throw exception");//主动抛出异常，可通过try..catch来处理异常
		}catch(Exception f) {
			f.printStackTrace();
		}
		
	}
}
