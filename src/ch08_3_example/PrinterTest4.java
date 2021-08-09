package ch08_3_example;

interface NewPrintable {
	void print(String doc);
	default void printCMYK(String doc) {
	}
}

// 기존 흑백 프린트
class OldDriver implements NewPrintable {
	@Override
	public void print(String doc) {
		System.out.println("[OldDriver Printing]");
		System.out.println(doc + "\n");
	}
}

// 새로운 컬러 프린트
class NewDriver implements NewPrintable {
	@Override
	public void print(String doc) {
		System.out.println("[Samsung NewDriver black&white Printing]");
		System.out.println(doc + "\n");
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("[Samsung NewDriver Color Printing]");
		System.out.println(doc + "\n");
	}
}
public class PrinterTest4 {
	public static void main(String[] args) {
		String myDoc = "this is a report....";
		NewPrintable prn;
		prn = new OldDriver();
		prn.print(myDoc);
		
		prn = new NewDriver();
		prn.print(myDoc);
		prn.printCMYK(myDoc);
	}

}
