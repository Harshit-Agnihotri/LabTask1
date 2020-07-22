
public class JavaTester {
	public int counter = 0;
	public static int staticCounter = 0;
	public JavaTester(){
		counter++;
		staticCounter++;
	}
	public static void main(String[] args) {
		Javatester tester = new JavaTester();
		Javatester tester1 = new JavaTester();
		Javatester tester2 = new JavaTester();
		System.out.println("counter:"+tester2.counter);
		System.out.println("static counter:"+tester2.staticCounter);


	}

}
