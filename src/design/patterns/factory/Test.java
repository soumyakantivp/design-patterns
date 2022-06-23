package design.patterns.factory;

public class Test {
public static void main(String[] args) {
	Sheep saun = (Sheep) AnimalFactory.getInstance("sheep", "shaun", 14);
	Crow kaka = (Crow) AnimalFactory.getInstance("crow", "kaka", 4);
	
	System.out.println(saun);
	System.out.println(kaka);
}
}
