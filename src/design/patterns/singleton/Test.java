package design.patterns.singleton;

public class Test {
	public static void main(String[] args) {
		Sun mySun = Sun.getSun("sunio", 12);
		Sun mySun2 = Sun.getSun("giyan", 14);
		if(mySun.hashCode() == mySun2.hashCode()) {
			System.out.println("Test Passed: "+mySun);
		}
		else {
			System.err.println("Test Failed");
		}
	}
}
