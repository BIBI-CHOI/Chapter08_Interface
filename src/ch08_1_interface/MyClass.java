package ch08_1_interface;

public class MyClass {
	// �ʵ�
	RemoteControl rc = new Television();
	
	// ������
	MyClass() {
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.trunOn();
		rc.setVolume(5);
	}
	
	// �޼ҵ�
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
