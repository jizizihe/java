import java.io.*;
public class ClassObjectImport {
	int myclass;
	/* creat class and object to use */
	public ClassObjectImport(String name) {
		System.out.println(name+"1");
	}

	public ClassObjectImport(int ss) {
		System.out.println("myclass"+ss);
	}
	/* method to use  */
	public void setTime(int time) {
		myclass = time;
	}

	public void getTime() {
		System.out.println("myclass"+myclass);	
		//return baijie;
	}
}
