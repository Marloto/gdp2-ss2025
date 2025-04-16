package lecture20250416;

abstract class Figur {
	public abstract double flaeche();
}

// Wann müssen die abstrakten methoden implementiert werden
// immer? gibt es ausnahmen?
class Rechteck extends Figur {
	public double flaeche() {
		return 0;
	}
}

class Quadrat extends Rechteck {
	
}

public class AbstractExamples {
	public static void main(String[] args) {
		Figur f = new Quadrat();
		f.flaeche(); 
	}
}
