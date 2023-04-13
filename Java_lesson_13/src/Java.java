
public class Java {
	int method() throws RuntimeException {
		return 1;
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Java java = new Java();
		Java child = new Child();
		System.out.println(java.method());
		System.out.println(child.method());

	}

}

class Child extends Java {
	
	@Override
	int method() throws RuntimeException {
		return 2;
	}
}

//public class Java_2 {
//
//}
