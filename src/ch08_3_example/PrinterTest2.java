package ch08_3_example;

class SP204Driver implements Printable{
	@Override
	public void peint(String doc) {
		System.out.println("[Samsung SP204Driver printing");
		System.out.println(doc + "\n");
	}
	
}
class LP870Driver implements Printable {
	@Override
	public void peint(String doc) {
		System.out.println("[LG LP870Driver printing");
		System.out.println(doc + "\n");
	}
	
}
public class PrinterTest2 {
	public static void main(String[] args) {
		String myDoc = "This is a report....";
		Printable prn = null;
		
		// 프린터 드라이버 테스트
		prn = new SP204Driver();
		prn.peint(myDoc);
		
		prn = new LP870Driver();
		prn.peint(myDoc);
	}
}
