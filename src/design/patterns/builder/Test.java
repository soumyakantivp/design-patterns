package design.patterns.builder;

public class Test {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle.VehicleBuilder("v8",4).build();
		Vehicle v2 = new Vehicle.VehicleBuilder("v8",4).setAirbags(4).build();
		System.out.println(v1);
		System.out.println(v2+"\n");
		
		//simple
		VehicleSimple v3 = new VehicleSimple("v8",4);
		VehicleSimple v4 = new VehicleSimple("v8",4).setAirbags(4);
		System.out.println(v3);
		System.out.println(v4);
	}
}
