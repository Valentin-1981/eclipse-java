
public class Example {
	static int _i = 5;
	static Object method(int i, float f, boolean b, Object o, String s, int... j) {
		System.out.println(_i);
		System.out.println(i);
		System.out.println(f);
		System.out.println(b);
		System.out.println(o);
		System.out.println(s);
		for(int k : j) {
			System.out.println(k);
		}
		
		return new Object();
	}
}

class OtherExample extends Example {
	public static void main(String[] args) {
		System.out.println(Example.method(5, 4.324f, true, new Object(), "Hello!!!", 111, 222, 333, 444, 555, 666, 777));
	}
}
