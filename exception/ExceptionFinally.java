import java.io.*;
class ValueFinally {
	public int getValue(int a, int b) throws Exception{
		int ret = 0;
		try{
			ret = a/b;
		}catch(Exception e){
			System.out.println("main exception not throw:"+e);//在main中异常并没有抛出,之在方法中抛出异常
			throw e;//在main中异常正常抛出。
		}finally{//无论是否发生异常都会执行finally块中的代码
			System.out.println("-----end-----");
		}
		return ret;
	}
}

public class ExceptionFinally {
	public static void main(String[] args) {
		ValueFinally value = new ValueFinally();
		try{
			System.out.println("getvalue:"+value.getValue(20, 0));//抛出异常，因为0不能作除数
		}catch(Exception e) {//抛出所有异常
			System.out.println("get exception throw:"+e);
		}
	}
}
