
public class Java_lessons_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Toyota toyota = new Toyota();
//		System.out.println(toyota.getMaxSpeed());
//		System.out.println(toyota.numOfSeeds);
		Java_lessons_3 main = new Java_lessons_3();
		Car car = new Toyota();
		main.useCar(car);
	}
	
	void useCar(Car car) {
		car.driving();
		System.out.println(car.getNumOfSeeds());
	}

}
