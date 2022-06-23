package design.patterns.builder;

public class VehicleSimple {
	// required
	private String engine;
	private int wheels;
	
	// optional
	private int airbags;

	
	public VehicleSimple(String engine, int wheels) {
		super();
		this.engine = engine;
		this.wheels = wheels;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getAirbags() {
		return airbags;
	}
	public VehicleSimple setAirbags(int airbags) {
		this.airbags = airbags;
		return this;
	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", airbags=" + airbags + "]";
	}
}
