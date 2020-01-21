通过读写文件来理解java的io输入输出。

### 一、文件输入输出

#### FileStreamTest.java

````java
import java.io.*;

public class FileStreamTest {
    public static void main(String args[]) {
        try {
            //创建test.txt，并往里面写数据。
            OutputStream output = new FileOutputStream("test.txt");
            String text = "Today is a beautiful day";
            byte[] mybytes = text.getBytes();
            output.write(mybytes); // writes the bytes
            output.close();
            /* 读取test.txt中的数据*/
            InputStream input = new FileInputStream("test.txt");
            int size = input.available();//返回与之关联的文件的字节数
            for (int i = 0; i < size; i++) {
                System.out.print((char)input.read());//（char）将字节数据转换为字符数据
            }
            input.close();
            System.out.println();//换行
            /* 如果必须设置编码格式，需要使用OutputStreamWriter和FileOutputStream来指定编码格式*/
            OutputStream output2 = new FileOutputStream("testUTF-8.txt");
            OutputStreamWriter writer= new OutputStreamWriter(output2, "UTF-8");//指定编码格式
            String textUTF = "Tomorrow is a good day";
            writer.write(textUTF);//通过write方法写入
            writer.append(", so im happy");//通过append方法写入
            writer.close();
            output2.close();
            /*读取testUTF-8.txt中的内容*/
            InputStream input2 = new FileInputStream("testUTF-8.txt");
            InputStreamReader reader = new InputStreamReader(input2, "UTF-8");
            StringBuffer getDate =  new StringBuffer();
            while(reader.ready()) {
                getDate.append((char)reader.read());//通过char来转换，不然就是字节流                                                                                                                         
            }
            System.out.println(getDate.toString());
            reader.close();
            input2.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
````

#### 结果

````bash
Today is a beautiful day
Tomorrow is a good day, so im happy
````

### 二、控制台输入字符串

#### BufferRead.java

````java
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
````

#### 结果

````bash
Enter 'end' to quit.
sdfsfsdfdsfs
sdfsfsdfdsfs
end
end
````

