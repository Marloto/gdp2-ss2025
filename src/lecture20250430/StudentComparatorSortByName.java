package lecture20250430;

import java.util.Comparator;

public class StudentComparatorSortByName implements Comparator {

	public int compare(Object o1, Object o2) {
		if(o1 == o2) {
			return 0;
		}
		
		if(o1 == null) {
			return -1;
		}
		
		if(o2 == null) {
			return 1;
		}
		
		if(!(o1 instanceof Student) && !(o2 instanceof Student)) {
			return 0;
		}
		if(!(o1 instanceof Student)) {
			return -1;
		}
		if(!(o2 instanceof Student)) {
			return 1;
		}
		
		
		// was passiert dann wenn klar ist, es sind zwei Studenten
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		
		return s1.getName().compareTo(s2.getName());
	}

}
