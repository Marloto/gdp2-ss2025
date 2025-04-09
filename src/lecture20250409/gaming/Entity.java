package lecture20250409.gaming;

public class Entity {
	protected int healthpoint = 42;
	
	public Entity() {
		this(42);
		System.out.println("b");
	}
	
	public Entity(int hp) {
		this.healthpoint = hp;
		System.out.println("c");
	}
	
	
	
	public int getHealthpoint2() {
		return healthpoint;
	}
	
	public String toString() {
		return "Entity with " + healthpoint + "hp";
	}
}
