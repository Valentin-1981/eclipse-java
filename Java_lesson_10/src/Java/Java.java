package Java;

public class Java {

	enum CoffeeSize {SMALL(100), MEDIUM(200), BIG(300) {
		String getCoffeeClass() {
			return "B";
		}
	};
	
		CoffeeSize(int mililiters){
			this.mililiters = mililiters;
		}
		
		int mililiters;
		
		int getMililiters() {
			return this.mililiters;
		}
		String getCoffeeClass() {
			return coffeeClass;
		}
		String coffeeClass = "A";

	
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeSize coffeeSize = CoffeeSize.BIG;
		System.out.println(coffeeSize);
		System.out.println(coffeeSize.getMililiters());
		System.out.println(coffeeSize.getCoffeeClass());

	}
	
}
