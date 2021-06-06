package application;

import model.entities.Duck;

public class Program {

	public static void main(String[] args) {
		Duck duck = new Duck();
		
		duck.quack();
		duck.swim();
		duck.display();

	}

}
