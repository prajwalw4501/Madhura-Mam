package fruitsassignment;

public class Orange extends Fruits {
	private String loc;

	public Orange(String name, String color, double weight, String loc) {
		super(name, color, weight);
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Color: " + color + " Weight: " + weight + " Speciality: " + loc;
	}

	public String taste() {
		return "SOUR";

//		System.out.println(Tastetype.SOUR);
	}

	public void juice() {
		System.out.println(name + "is Juiccyy!");
	}

}
