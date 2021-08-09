package ch08_3_example;

//  새로운(컬러) 프린터 등장
class SP9600CDriver implements ColorPrintable {
	@Override
	public void printCMYK(String doc) {
		System.out.println("[Samsung SP9600CDriver Color Printing");
		System.out.println(doc + "\n");
	}

	@Override
	public void peint(String doc) {
		System.out.println("[Samsung SP9600CDriver black&white Printing");
		System.out.println(doc + "\n");
	}
}
public class PrinterTest3 {
	public static void main(String[] args) {
		String myDoc = "this is a report....";
		
		ColorPrintable prn = new SP9600CDriver();
		prn.peint(myDoc);
		prn.printCMYK(myDoc);
	}

}
