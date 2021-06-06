package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.DecoyDuck;
import model.entities.Duck;
import model.entities.MallardDuck;
import model.entities.RedheadDuck;
import model.entities.RubberDuck;

public class Program {

	public static void main(String[] args) {
		List<Duck> listDuck = new ArrayList<>();
		
		listDuck.add(new MallardDuck());
		listDuck.add(new RedheadDuck());
		listDuck.add(new RubberDuck());
		listDuck.add(new DecoyDuck());
		
		for(Duck duck:listDuck) {
			duck.display();
			duck.performQuack();
			duck.swim();
			duck.performFly();
			System.out.println();
		}

	}

}
