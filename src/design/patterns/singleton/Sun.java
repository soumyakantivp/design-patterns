package design.patterns.singleton;

public class Sun {
	private static Sun sun;
	private String sname;
	private int sage;
	
	
	
	private Sun(String sname, int sage) {
		super();
		this.sname = sname;
		this.sage = sage;
	}
	
	public static Sun getSun(String name, int age) {
		if(sun == null) {
			sun = new Sun(name, age);
			System.out.println("new sun created: "+sun);
			return sun;
		}
		System.out.println("new sun alreay exists: "+sun);
		return sun;
	}
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	@Override
	public String toString() {
		return "Sun [sname=" + sname + ", sage=" + sage + "]";
	}
	
}
