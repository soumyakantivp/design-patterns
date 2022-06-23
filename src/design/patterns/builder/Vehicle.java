package design.patterns.builder;

public class Vehicle {
	private String engine;
	private int wheels;
	
	private int airbags;

	
	private Vehicle(VehicleBuilder builder) {
		super();
		this.engine = builder.engine;
		this.wheels = builder.wheels;
		this.airbags = builder.airbags;
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
	
	static class VehicleBuilder{
		private String engine;
		private int wheels;
		
		private int airbags;
		
		public VehicleBuilder(String engine, int wheels) {
			super();
			this.engine = engine;
			this.wheels = wheels;
		}
		public VehicleBuilder setAirbags(int airbags) {
			this.airbags = airbags;
			return this;
		}
		public Vehicle build() {
			return new Vehicle(this);
		}

	}

	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", wheels=" + wheels + ", airbags=" + airbags + "]";
	}
	
	
}
