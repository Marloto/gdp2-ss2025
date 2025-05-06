package lecture20250430;

import java.util.Comparator;

public class StudentComparatorSortByMatrikelnummerDesc extends StudentComparatorSortByMatrikelnummer implements Comparator {

	public int compare(Object o1, Object o2) {
		return super.compare(o1, o2) * -1;
	}

}
