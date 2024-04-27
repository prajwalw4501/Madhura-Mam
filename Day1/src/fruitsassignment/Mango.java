package fruitsassignment;

public class Mango extends Fruits {
	private String loc;

	public Mango(String name, String color, double weight, String loc) {
		super(name, color, weight);
		this.loc = loc;
	}

	public void pulp() {
		System.out.println("Name: " + name + " Color: " + color + " PULP");
	}

	@Override
	public String toString() {
		return "Name: " + name + " Color: " + color + " Weight: " + weight + " Speciality: " + loc;
	}

	public String taste() {
		return "SOUR N SWEET";
		// System.out.println(Tastetype.SOUR_n_SWEET);

	}

}
