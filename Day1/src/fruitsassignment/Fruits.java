package fruitsassignment;

public abstract class Fruits {
	protected String name;
	protected String color;
	protected double weight;
//	protected Tastetype type; 

	public Fruits(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
//		this.type=type;
	}

	@Override
	public String toString() {
		return "Fruits : Name: " + name + " Color: " + color + " Weight: " + weight;
	}

	abstract String taste();

//	public  void stale() {
//		System.out.println("Not Freshh!");
//	}
}
