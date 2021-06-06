package model.entities;

public class MuteQuack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack: Mute");
		
	}

}
