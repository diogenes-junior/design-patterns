package application;

import model.entities.FlyRocketPowered;
import model.entities.MallardDuck;

public class Program {

	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		mallardDuck.display();
		mallardDuck.performFly();
		System.out.println();
		
		mallardDuck.setFlyBehavior(new FlyRocketPowered());
		mallardDuck.display();
		mallardDuck.performFly();
		
	}
}
