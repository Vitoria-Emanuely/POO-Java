package DuckProject;

public class FlyNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("Eu n�o posso voar");
	}
}
