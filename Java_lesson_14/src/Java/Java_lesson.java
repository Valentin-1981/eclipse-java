package Java;

public class Java_lesson {
	static int i;
	static int a = 6;
	int j;
	static {
		System.out.println("Static initializer");
	}
	{
		System.out.println("initializer");
	}
	{
		System.out.println("second initializer");
	}
	
	Java_lesson() {
		i++;
		System.out.println("constructor");
	}
	
	static void staticMethod() {
		System.out.println("static method");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();
		
		System.out.println(Java_lesson.i);
		System.out.println(Java_lesson.a);
		new Java_lesson();

	}

}
