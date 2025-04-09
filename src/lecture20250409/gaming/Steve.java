package lecture20250409.gaming;

public class Steve extends Entity {
	protected int healthpoint = 42;
	
	public Steve() {
		this(21);
		System.out.println("a");
	}
	
	public Steve(int health) {
		super(health);
		System.out.println("a");
	}
	
	public int getHealthpoint() {
		return healthpoint;
	}
	public int getHealthpoint3() {
		return super.healthpoint;
	}
	
	public String toString() {
		String string = super.toString();
		return string + " / Steve with " + healthpoint + "hp";
	}
}
