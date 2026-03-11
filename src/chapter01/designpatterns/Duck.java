package chapter01.designpatterns;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	public abstract void display();

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void swim() {
		System.out.print("All ducks float, even decouys!");
	}

}
