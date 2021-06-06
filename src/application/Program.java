package application;

import model.entities.Duck;
import model.entities.MallardDuck;
import model.entities.RedheadDuck;

public class Program {

	public static void main(String[] args) {
		Duck duck = new RedheadDuck();
		Duck duck2 = new MallardDuck();
		
		duck.quack();
		duck.swim();
		duck.display();
		
		duck2.quack();
		duck2.swim();
		duck2.display();

	}

}
