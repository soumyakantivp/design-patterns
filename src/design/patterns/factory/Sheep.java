package design.patterns.factory;

public class Sheep extends Animal{
	
	
	public Sheep(String name, int age) {
		super(name, age, 4);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void countLegs() {
		// TODO Auto-generated method stub
		System.out.println("leg count = "+getLegs());
		
	}

}
