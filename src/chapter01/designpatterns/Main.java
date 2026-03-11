package chapter01.designpatterns;

public class Main {

	public static void main(String[] args) {
		Duck duck = new Duck();
		testDuck(duck);
		
		MallardDuck mallardDuck = new MallardDuck();
		testDuck(mallardDuck);
		
		RedheadDuck redheadDuck = new RedheadDuck();
		testDuck(redheadDuck);
	}
	
	private static void testDuck(Duck duck) {
		duck.display();
		duck.quack();
		duck.swim();
		System.out.println();
	}
}
