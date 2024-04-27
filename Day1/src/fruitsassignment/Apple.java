package fruitsassignment;

public class Apple extends Fruits {
	private String loc;

	public Apple(String name, String color, double weight, String loc) {
		super(name, color, weight);
		this.loc = loc;
	}

	public void jam() {
		System.out.println(name + " is use to make JAM");
	}

	@Override
	public String toString() {
		return "Name: " + name + " Color: " + color + " Weight: " + weight + " Speciality: " + loc;
	}

	public String taste() {
		return "SWEET";
		// System.out.println(Tastetype.SWEET);
	}

}
