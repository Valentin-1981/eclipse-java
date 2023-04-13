import com.max.*;

public class Human {
	public static void main(String[] args) {
		System.out.println("Hello, World!!!");
		Human human = new Human();
		human.buyBread();
		human.buyMilk();
		System.out.println(human.getAge(5, 0.2, true, human));		
	}
	
	
	
	int age = 20;
	
	int getAge(int i, double d, boolean bool, Human human) {
		return human.age;
	}
	
	void buyBread() {
		System.out.println("Buy bread!!!");
	}
	
	void buyMilk() {
		System.out.println("Buy milk!!!");
	}
	
//	static {
//		System.out.println("Hello, World!!!");
//		System.exit(0);
//	}
	
	Car car;
	Plane plane;

}
