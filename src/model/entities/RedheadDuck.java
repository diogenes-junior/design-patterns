package model.entities;

public class RedheadDuck extends Duck{
	public RedheadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("RedheadDuk");
	}
}
