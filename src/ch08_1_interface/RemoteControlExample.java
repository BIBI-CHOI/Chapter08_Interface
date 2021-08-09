package ch08_1_interface;

interface RemoteControl {
	// 상수 선언
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	public abstract void trunOn();
	public abstract void trunOff();
	public abstract void setVolume(int vlume);
}

class Television implements RemoteControl {
	// 필드
	private int volume;
	private String name;
	
	public Television(String name) {
		this.name = name;
	}
	
	@Override
	public void trunOn() {
		System.out.println(name + "TV를 켭니다.");
	}
	
	@Override
	public void trunOff() {
		System.out.println(name + "TV를 끕니다.");
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
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}

class Audio implements RemoteControl {
	// 필드
	private int volume;
	
	@Override
	public void trunOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
}

public class RemoteControlExample {
	public static void main(String[] args) {
		
		// 인터페이스를 사용하지 않을 경우
		// 각 제조사 TV가 완성 되어야만 실행 코드를 작성할 수 있다.
		Television tv1 = new Television("삼성");
		Television tv2 = new Television("LG");
		tv1.trunOn();
		tv2.trunOn();
		
		// TV완성을 기다리지 않아도 구현 가능
		RemoteControl rc = new Television("HP");
		rc.trunOn();
		rc.setVolume(1000);
		rc.trunOff();
	}
}
