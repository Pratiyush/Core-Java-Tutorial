package demo.enumwithbehaviour;

public enum Model {
	ALTO (800, 18.8f),
	ZEN (1000, 16.5f),
	SWIFT (1300, 13.2f),
	SX4 (1500, 11.1f);
	
	private final int engineCC;
	private final float fuelEfficiency;
	
	Model(int engineCC, float fuelEfficiency) {
		this.engineCC = engineCC;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public int getEngineCC() {
		return engineCC;
	}

	public float getFuelEfficiency() {
		return fuelEfficiency;
	}
	
	public float getFuelRequired(float distance) {
		return (distance / this.fuelEfficiency);
	}
	
	public static void main(String[] args) {
		float distance = Float.parseFloat(args[0]);
		for (Model c : Model.values()) {
			System.out.printf("Fuel required to go %f km in %s is %f litres\n", distance, c, c.getFuelRequired(distance));
		}
	}
}
