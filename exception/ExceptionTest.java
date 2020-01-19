import java.io.*;
public class ExceptionTest {
	 // 在主方法中的所有异常都可以不使用try...catch进行处理。
	public static void main(String[] args) {
		try{
			/* 执行第一个异常*/
			//int a[] = new int[5];
			//System.out.println("access element 6:"+x[6]);
			/* 执行第二个异常 */
			Object[] x = new String[3];
			x[0] = new Integer(0);
		}catch(ArrayIndexOutOfBoundsException e) {//非法索引访问数组时抛出异常
			System.out.println("exception throw:"+e);
		}catch(ArrayStoreException f) {//将错误类型的对象存储到一个对象数组时抛出异常
			System.out.println("exception throw2:"+f);
		} 
		System.out.println("----end try catch----");
		
	}
}
