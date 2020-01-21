import java.io.*;

public class BufferRead {
	public static void main(String args[]) throws IOException {
		/*使用 BufferedReader 在控制台读取字符*/
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));//必须使用InputStreamReader把System.in转换成Reader
		String getData;
		System.out.println("Enter 'end' to quit.");
		do {
			getData = input.readLine();//使用readLine()来读取字符串，使用read读取字符。
			System.out.println(getData);
		} while (!getData.equals("end"));
	}
}

