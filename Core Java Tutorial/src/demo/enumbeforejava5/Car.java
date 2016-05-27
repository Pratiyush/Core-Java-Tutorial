package demo.enumbeforejava5;

public class Car {
	
	public static final int MODEL_ALTO=0;
	public static final int MODEL_ZEN=1;
	public static final int MODEL_SWIFT=2;
	public static final int MODEL_SX4=3;
	
	public static final int COLOR_RED=0;
	public static final int COLOR_GREY=1;
	public static final int COLOR_WHITE=2;
	
	private final int model;
	private final int color;
	
	public Car(int model, int color) {
		this.model = model;
		this.color = color;
	}

	public int getModel() {
		return this.model;
	}
	
	public int getColor() {
		return this.color;
	}
	
	public String toString() {
		String str="";
		switch (this.color) {
		case COLOR_RED:
			str = "Red";
			break;
		case COLOR_GREY:
			str = "Grey";
			break;
		case COLOR_WHITE:
			str = "White";
			break;
		default:
			str = "Unknown color";
			break;
		}
		switch(this.model) {
		case MODEL_ALTO:
			str += " Alto";
			break;
		case MODEL_ZEN:
			str += " Zen";
			break;
		case MODEL_SWIFT:
			str += " Swift";
			break;
		case MODEL_SX4:
			str += " SX4";
			break;
		default:
			str += " Unknown model";
			break;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Car c = new Car(5,7);
	}
}
