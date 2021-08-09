package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report....";
		Printable prn = null;
		
		// 삼성 프린터 출력 검사
		prn = new SPrinterDirver();
		prn.peint(myDoc);
		
		// LG 프린터 출력 검사
		prn = new LPrinterDirver();
		prn.peint(myDoc);
	}
}


// 삼성 프린터 드라이버
class SPrinterDirver implements Printable {
	@Override
	public void peint(String doc) {
		System.out.println("From Samdung printer-----");
		System.out.println(doc);
		System.out.println();
	}
}


// LG 프린터 드라이버
class LPrinterDirver implements Printable {
	@Override
	public void peint(String doc) {
		System.out.println("From LG printer-----");
		System.out.println(doc);
	}
}