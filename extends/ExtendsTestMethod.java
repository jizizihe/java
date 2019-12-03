class Extends {
	void testFather () {
		System.out.println("test father");	
	}	
}

public class ExtendsTestMethod extends Extends {

	void testFather () {
		System.out.println("method restart write");
	}

	public static void main(String []args) {
		ExtendsTestMethod getTest = new ExtendsTestMethod();
		getTest.testFather();
	}
}
