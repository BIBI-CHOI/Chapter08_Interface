package ch08_1_interface;

interface Searchable {
	public abstract void search(String url);
}

class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	private String name;
	
	public SmartTelevision(String name) {
		this.name = name;
	}
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");
		
	}
	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
		
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
class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision("SAMSUNG Smart");
		
		// 자동형변환(RemoteControl <---- SmartTelevision)
		// RemoteControl 기능만 사용 가능
		RemoteControl rc = stv;
		rc.trunOn();
		
		// 자동형변환(Searchable <---- SmartTelevision)
		// Searchable 기능만 사용 가능
		Searchable sc = stv;
		sc.search("www.google.com");
	}
}

