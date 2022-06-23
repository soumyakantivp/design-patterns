package design.patterns.factory;

public class Crow extends Animal{
	public Crow(String name, int age) {
		super(name, age, 2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void countLegs() {
		// TODO Auto-generated method stub
		System.out.println("leg count = "+getLegs());
		
	}
	
}
