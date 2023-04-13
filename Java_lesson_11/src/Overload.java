
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadChild overload = new OverloadChild();
		
		System.out.println(overload.addTwoDigits(3, 5));
		System.out.println(overload.addTwoDigits(2.1, 3.5));
		overload.addTwoDigits(5);

	}
	
	int addTwoDigits(int a, int b) {
		return a + b;
	}
	
	double addTwoDigits(double a, double b) {
		return a + b;
	}

}

class OverloadChild extends Overload {
	public void addTwoDigits(int j) {
		System.out.println("Hello world!");
	}
}
