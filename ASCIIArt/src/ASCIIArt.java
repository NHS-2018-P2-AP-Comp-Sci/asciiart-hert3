
public class ASCIIArt {
	public static void line1() {
		System.out.print("________________");
	}
	public static void line2() {
		System.out.print("ASCII ASCII ");
	}
	public static void line3() {
		line2();
		line2();
		line2();
	}
	public static void line4() {
		line1();
		line1();
		line1();
	}
	public static void main(String[] args) {
		line3();
		System.out.println("");
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		System.out.println(",,,,JJJ,,,,,A,,,,,V,,,,,,,V,,,,,A,,,,,,,,,,");
		System.out.println(",,,,,J,,,,,A,A,,,,,V,,,,,V,,,,,A,A,,,,,,,,,");
		System.out.println(",,,,,J,,,,AAAAA,,,,,V,,,V,,,,,AAAAA,,,,,,,,");
		System.out.println(",J,,,J,,,A,,,,,A,,,,,V,v,,,,,A,,,,,A,,,,,,,");
		System.out.println(",,JJJ,,,A,,,,,,,A,,,,,V,,,,,A,,,,,,,A,,,,,,");
		line4();
	}
}
