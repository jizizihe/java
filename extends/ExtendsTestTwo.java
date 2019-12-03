class ExtendsTwo {
	void testFatherTwo() {
		System.out.println("test father");	
	}	
}
class ExtendsThree extends ExtendsTwo {
	void testFatherThree() {
		System.out.println("test son");
	}	
}

public class ExtendsTestTwo extends ExtendsThree {
	public static void main(String []args) {
		ExtendsTestTwo getTestTwo = new ExtendsTestTwo();
		getTestTwo.testFatherTwo();	
		getTestTwo.testFatherThree();
	}
}
