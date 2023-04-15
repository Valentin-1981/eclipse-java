
interface ISomeInterface extends IOtherInterface {
	abstract void addTwoDigits(int one, int two);
	public static final int someVariable = 5;
	int i = 5;
}

interface IOtherInterface {
	void someMethod();
}

interface Bancable {
	void bounce();
}

class Example implements ISomeInterface, Bancable {
	@Override
	public void addTwoDigits(int one, int two) {
			
	}
	
	public void someMethod() {
		
	}
	
	public void bounce() {
		
	}
	
}