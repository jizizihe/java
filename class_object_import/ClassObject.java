public class ClassObject {
	int baijie;
	/* creat class and object to use */
	public ClassObject(String name) {
		System.out.println(name+"2222");
	}

	public ClassObject(int ss) {
		System.out.println("szbaijie"+ss);
	}
	/* method to use  */
	public void setTime(int time) {
		baijie = time;
	}

	public void getTime() {
		System.out.println("szbaijie4444:"+baijie);	
		//return baijie;
	}

	/* main */
	public static void main(String[] args) {
		System.out.println("szbaijie1111");	
		ClassObject myClassObject = new ClassObject("szbaijie");
		ClassObject myClassObject_2 = new ClassObject(3333);
		myClassObject.setTime(2018);
		myClassObject.getTime();
		System.out.println("szbaijie5555:"+myClassObject.baijie);
	}	
}
