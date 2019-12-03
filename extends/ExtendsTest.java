class Extends {
	void testFather () {
		System.out.println("test father");	
	}	
}

public class ExtendsTest extends Extends {
	public static void main(String []args) {
		ExtendsTest getTest = new ExtendsTest();
		getTest.testFather();	
	}
}
