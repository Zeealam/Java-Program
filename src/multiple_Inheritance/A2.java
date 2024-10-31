package multiple_Inheritance;

public class A2 implements Printable2,Showable2{
	

	public static void main(String[] args) {
		A2 a2= new A2();
		a2.show();
		a2.print();

	}

	@Override
	public void show() {
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		System.out.println("Welcome");
		
	}

}
