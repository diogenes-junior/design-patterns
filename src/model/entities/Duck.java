package model.entities;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("swim");
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
}
