import java.io.*;
class MyException extends Exception {//自定义检查异常类,必须通过try..catch来处理异常。
	//如果是自定义运行时异常类，需要继承RuntimeException类，可以不使用try..catch处理异常，由jvm自动处理。
	public MyException(String msg) {
		super(msg);//调用父类的构造方法
	}
}
public class MyExceptionTest {
	public static void main(String[] args) {
		try{
			throw new MyException("自定义异常");
		}catch(Exception e) {
			System.out.println("MyException throw:"+e);
		} 
	}
}
