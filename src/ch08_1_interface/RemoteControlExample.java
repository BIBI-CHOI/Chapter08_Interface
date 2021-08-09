package ch08_1_interface;

interface RemoteControl {
	// ��� ����
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	public abstract void trunOn();
	public abstract void trunOff();
	public abstract void setVolume(int vlume);
}

class Television implements RemoteControl {
	// �ʵ�
	private int volume;
	private String name;
	
	public Television(String name) {
		this.name = name;
	}
	
	@Override
	public void trunOn() {
		System.out.println(name + "TV�� �մϴ�.");
	}
	
	@Override
	public void trunOff() {
		System.out.println(name + "TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
}

class Audio implements RemoteControl {
	// �ʵ�
	private int volume;
	
	@Override
	public void trunOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	public void trunOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + this.volume);
	}
}

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// �������̽��� ������� ���� ���
		// �� ������ TV�� �ϼ� �Ǿ�߸� ���� �ڵ带 �ۼ��� �� �ִ�.
		Television tv1 = new Television("�Ｚ");
		Television tv2 = new Television("LG");
		tv1.trunOn();
		tv2.trunOn();
		
		// TV�ϼ��� ��ٸ��� �ʾƵ� ���� ����
		RemoteControl rc = new Television("HP");
		rc.trunOn();
		rc.setVolume(1000);
		rc.trunOff();
	}
}
