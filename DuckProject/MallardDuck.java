package DuckProject;

public class MallardDuck extends Duck {
	public MallardDuck() {
		super.setQuackBehavior(new Quack());
		super.setFlyBehavior(new FlyWithWings());
	}
	
	@Override
	public void display() {
		System.out.println("Eu sou um Mallard duck real");
	}
}
