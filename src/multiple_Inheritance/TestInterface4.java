package multiple_Inheritance;

public class TestInterface4 implements Showable{

	public static void main(String[] args) {
		TestInterface4 ti = new TestInterface4();
		ti.print();
		ti.show();

	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}

	@Override
	public void show() {
		System.out.println("Welcome");
		
	}

}
