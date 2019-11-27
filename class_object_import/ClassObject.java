public class ClassObject {
	int myclass;
	/* creat class and object to use */
	public ClassObject(String name) {
		System.out.println(name+"1");
	}

	public ClassObject(int ss) {
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

	/* main */
	public static void main(String[] args) {
		ClassObject myClassObject = new ClassObject("myclass");
		ClassObject myClassObject_2 = new ClassObject(2);
		myClassObject.setTime(3);
		myClassObject.getTime();
		System.out.println("myclass"+myClassObject.myclass);
	}	
}
