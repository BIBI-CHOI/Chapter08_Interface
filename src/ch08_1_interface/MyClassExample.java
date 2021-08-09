package ch08_1_interface;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("1)----------------");
		
		MyClass myclass1 = new MyClass();
		myclass1.rc.trunOn();
		myclass1.rc.setVolume(5);
		
		System.out.println("2)----------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)----------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		
		MyClass myclass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}

