import java.io.*;
public class ClassObjectImportTest {
	/* main */
	public static void main(String[] args) {
		ClassObjectImport myClassObjectImport = new ClassObjectImport("myclass");
		ClassObjectImport myClassObjectImport_2 = new ClassObjectImport(2);
		myClassObjectImport.setTime(3);
		myClassObjectImport.getTime();
		System.out.println("myclass"+myClassObjectImport.myclass);
	}	
}
