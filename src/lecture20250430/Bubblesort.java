package lecture20250430;

public class Bubblesort { // <- "Sortierer"
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiereQuadrat(Quadrat[] arr) { // Object[] arr
        boolean getauscht = true;

        if (arr.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < arr.length - 1; ++i) {
                if (arr[i].getSeitenlaenge() > arr[i + 1].getSeitenlaenge()) {
                    Quadrat tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
    
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiereStudent(Student[] arr) { // Object[] arr
        boolean getauscht = true;

        if (arr.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < arr.length - 1; ++i) {
                if (arr[i].getMatrikelnummer() > arr[i + 1].getMatrikelnummer()) {
                    Student tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
    
    public static void sortiere(ISortable[] arr) { // Object[] arr
        boolean getauscht = true;

        if (arr.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < arr.length - 1; ++i) {
//                if (arr[i].getSortableAttribute() > arr[i + 1].getSortableAttribute()) {
            	if(arr[i].compare(arr[i + 1])) {
                	ISortable tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
}
