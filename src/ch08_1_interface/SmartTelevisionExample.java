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
		System.out.println("TV�� �մϴ�.");
		
	}
	@Override
	public void trunOff() {
		System.out.println("TV�� ���ϴ�.");
		
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
class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision("SAMSUNG Smart");
		
		// �ڵ�����ȯ(RemoteControl <---- SmartTelevision)
		// RemoteControl ��ɸ� ��� ����
		RemoteControl rc = stv;
		rc.trunOn();
		
		// �ڵ�����ȯ(Searchable <---- SmartTelevision)
		// Searchable ��ɸ� ��� ����
		Searchable sc = stv;
		sc.search("www.google.com");
	}
}

