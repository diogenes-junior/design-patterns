/*
 * Patos de borracha
 */

package model.entities;

public class RubberDuck extends Duck{
	
	@Override
	public void display() {
		System.out.println("RubberDuck");
	}
	
	@Override
	public void quack() {
		System.out.println("quack: squeak");
	}
}
