package design.patterns.factory;

public class AnimalFactory {
	static Animal getInstance(String type, String name, int age) {
		if(type.equalsIgnoreCase("sheep")) {
			return new Sheep(name, age);
		}
		else if(type.equalsIgnoreCase("crow")) {
			return new Crow(name, age);
		}
		return null;
	}
}
