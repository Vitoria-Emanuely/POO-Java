package DuckProject;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super.setFlyBehavior(new FlyNoWay());
		super.setQuackBehavior(new Squeak());
	}
	
	@Override
	public void display() {
		System.out.println("Eu sou um Rubber Duck");
	}
}
