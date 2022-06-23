package design.patterns.factory;

public abstract class Animal {
	private String name;
	private int age;
	private int legs;
	
	
	public Animal(String name, int age, int legs) {
		super();
		this.name = name;
		this.age = age;
		this.legs = legs;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public abstract void countLegs();


	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", legs=" + legs + "]";
	}
	
	
}
