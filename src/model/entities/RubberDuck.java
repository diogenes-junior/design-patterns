/*
 * Patos de borracha
 */

package model.entities;

public class RubberDuck extends Duck{
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("RubberDuck");
	}	
}
