package lecture20250409.otheranimals;

import lecture20250409.animals.Tier;

public class Frosch extends Tier {
	public Frosch() {
		// this.color = "blue"; <- geht nicht weil private
		this.name = "Froschi";
		 // this.alter = 2; geht nicht weil anderes package
	}
}
