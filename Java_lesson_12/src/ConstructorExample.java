
public class ConstructorExample extends MyParent {
	ConstructorExample() {
		super(5);
		System.out.println("ConstructorExample!");
	}
	
	public static void main(String[] args) {
		new ConstructorExample();
	}
}

class MyParent {
	MyParent(int j) {
		System.out.println("MyParentConstructor!");
	}
}


