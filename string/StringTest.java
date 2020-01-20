public class StringTest {
	String chageString(String str) {
		str = str +"im error.";
		return str;
	}	
	StringBuffer chageStringBuffer(StringBuffer strBuffer) {
		strBuffer = strBuffer.append("im error.");
		return strBuffer;
	}

	public static void main(String[] args) {
		String str = "today is nice day,";
		char[] ch = {'b', 'u', 't', ' ', 'i', 'm', ' ','c', 'r', 'a', 'z', 'y'};
		String str2 = new String(ch);
		System.out.println(str);
		System.out.println(str2);
		System.out.println("the string length=:"+str.length());//字符串长度
		/*连接两个字符串，因为String的不可变性，比StringBuffer与StringBuilder性能变差*/
		System.out.println(str.concat(str2));
		System.out.println(str+"im happy");
		System.out.printf("2020-%d"+"-%d:"+"%s im shy\n",1 , 20,str);//格式化字符串
		/*String 值的比较*/
		String str3 = "today";
		String str4 = "today";
		System.out.println("str3 == str4:"+(str3 == str4));//true,因为str3与str4都是指向常量池中的today，因此地址相等。
		System.out.println("str3 == str4:"+str3.equals(str4));//true
		String str5 = new String("tomorrow");
		String str6 = new String("tomorrow");
		System.out.println("str5 == str6:"+(str5 == str6));//false,因为new开辟了地址空间，引用不同,导致str5与str6地址不同。
		System.out.println("str5 == str6:"+str5.equals(str6));//true,equals比较引用，引用相同为true，然后类型，长度等都一致，最后返回true
		/* string不可变性,因此每次对Sting类改变时都会生成一个新的String对象，
		因此在方法chageString中并没有改变值,因此少量数据用String类*/
		StringTest stringtest = new StringTest();
		stringtest.chageString(str);	
		System.out.println(str);
		/*因为String类的不可变性，我们使用stringbuffer来改变值，
		因为每次都会对StingBuffer本身进行操作。*/
		StringBuffer strBuffer = new StringBuffer();
		/*StringBuilder与StringBuffer类似，但是效率比StringBuffer高
		在单线程中使用比较多，因为StringBuilder不是线程安全的*/
		//StringBuilder strBuilder = new StringBuilder();
		strBuffer.append("tomorrow is nice day,");
		stringtest.chageStringBuffer(strBuffer);	
		System.out.println(strBuffer);
		
	}
}
