package package_1;

class ConstructorExample {
	int i;
	ConstructorExample(String hello, int i) {
		this.i = i;
		System.out.println("Run");
		System.out.println(hello);
	}
	

}

public class Run {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello world!");
		ConstructorExample constructorExample = new ConstructorExample("Hello", 5);
		System.out.println(constructorExample.i);
	}
}
