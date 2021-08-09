package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		String myDoc = "This is a report....";
		Printable prn = null;
		
		// �Ｚ ������ ��� �˻�
		prn = new SPrinterDirver();
		prn.peint(myDoc);
		
		// LG ������ ��� �˻�
		prn = new LPrinterDirver();
		prn.peint(myDoc);
	}
}


// �Ｚ ������ ����̹�
class SPrinterDirver implements Printable {
	@Override
	public void peint(String doc) {
		System.out.println("From Samdung printer-----");
		System.out.println(doc);
		System.out.println();
	}
}


// LG ������ ����̹�
class LPrinterDirver implements Printable {
	@Override
	public void peint(String doc) {
		System.out.println("From LG printer-----");
		System.out.println(doc);
	}
}