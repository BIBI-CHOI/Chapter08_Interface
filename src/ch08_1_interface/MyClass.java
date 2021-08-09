package ch08_1_interface;

public class MyClass {
	// 필드
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass() {
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.trunOn();
		rc.setVolume(5);
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.trunOn();
		rc.setVolume(5);
	}
	void methodB() {
		rc.trunOn();
		rc.setVolume(5);
	}
}
