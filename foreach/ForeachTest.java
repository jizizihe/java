public class ForeachTest {
	
	public static void main(String[] args) {
		byte num[] = {1, 2, 3, 4}; //byte是java新增的变量类型，占一个字节、八位。
		for(byte num_test : num) {
			System.out.print(num_test);
			System.out.print(",");
		}
		System.out.println();//println
		char []num2 = {'a', 'b', 'c', 'd'}; //char在java占两个字节，c语言中占一位。
		for(char num2_test : num2) {
			System.out.print(num2_test);
			System.out.print(",");
		}
		System.out.print("\n");//print
		String num3[] = {"aaaa", "bbbb", "cccc", "dddd"}; //String字符串数据类型。
		for(String num3_test : num3) {
			System.out.print(num3_test);
			System.out.print(",");
		}
		System.out.println();//println
	}	
}
